package ej2oTrim.Herencia.Mascotas;

import java.util.*;

public class Inventario {
    public static void main(String[] args) {
        Mascotas gato = new Gato("Kika", 5, "Vivita y coleando", "01-02-2018", "Negro", false);
        mascotas.add(gato);
        Mascotas perro = new Perro("Luna", 4, "Viva", "01-01-2019", "Mezcla de razas", false);
        mascotas.add(perro);
        Mascotas canario = new Canario("Bailey", 2, "Vivo", "12-05-2020", "pico", true, "Amarillo", false);
        mascotas.add(canario);
        Mascotas loro = new Loro("Iago", 3, "Vivo", "01-03-2020", "pico", true, "India", true);
        mascotas.add(loro);
        //menu();
    }
    private static ArrayList<Mascotas> mascotas = new ArrayList<>();

    private String getTipoMascota(Mascotas m) {
        if (m instanceof Gato) {
            return "Gato";
        } else if (m instanceof Perro) {
            return "Perro";
        } else if (m instanceof Canario) {
            return "Canario";
        } else if (m instanceof Loro) {
            return "Loro";
        } else {
            return null;
        }
    }

    private String getTipoMascotaClass(Mascotas m){return m.getClass().getSimpleName();}

    public void mostrarLista(){
        System.out.println("=== LISTA DE ANIMALES ===");
        for (int i = 0; i < mascotas.size();i++) {
            Mascotas m = mascotas.get(i);
            String tipo = getTipoMascota(m);
            String nombre = m.getNombre();
            System.out.println(i + ": " + tipo + " " + nombre);
        }
    }

    //Método que muestra la lista de las revisiones de los perros (clase HistorialRevision)
    public void mostrarListaRevisionesPerros() {
        System.out.println("Lista de Revisiones del perro: ");
        for (int i = 0;i < mascotas.size();i++) {
            Mascotas m = mascotas.get(i);
            String tipo = getTipoMascota(m);
            String nombre = m.getNombre();

            if (Objects.equals(tipo, "Perro")){
                System.out.println(i + ": " + tipo + " " + nombre);
                for (HistorialRevision h : ((Perro)m).getHistorial()) {
                    System.out.println(h.toString());
                }
            }
        }
    }

    public static void mostrarDatosAnimal(int indice){
        if (indice >= 0 && indice < mascotas.size()) {
            System.out.println("MASCOTA " + indice + ": ");
            Mascotas m = mascotas.get(indice);
            m.muestra();
        }
    }

    public static void mostrarDatosTodos(){
        for (int i = 0; i < mascotas.size();i++) {
            mostrarDatosAnimal(i);
            System.out.println("");
        }
    }

    public static void insertarAnimal(Mascotas m){
        mascotas.add(m);
    }

    public boolean eliminarAnimal(int indice) {
        if (indice >= 0 && indice < mascotas.size()) {
            mascotas.remove(indice);
            return true;
        } else {
            return false;
        }
    }

    public void vaciarInventario(){
        mascotas.clear();
        System.out.println("El inventario está vacío.");
    }

    //Métodos de ordenación que sí funcionan
    public void ordenacionArrayList(){
        //Ordenado de mayor a menor por edad
        System.out.println("\nArrayList ordenado por nombre de mayor a menor: ");
        Collections.sort(mascotas, new Comparator<Mascotas>() {
            @Override
            public int compare(Mascotas o1, Mascotas o2) {
                //Aquí se compara m1 con m2 para ordenación ascendente y no al revés
                return o1.getNombre().compareTo(new String(o2.getNombre()));
            }
        });
        printArrayListMascota();
    }

    public void printArrayListMascota() {
        Iterator<Mascotas> iteradorArrayList = mascotas.iterator();
        int posicion = 0;
        while (iteradorArrayList.hasNext()) {
            System.out.println("Posición(" + posicion + ") = ");
            iteradorArrayList.next().muestra();
            posicion++;
        }
    }

    /* Ejemplo de búsqueda binaria recursiva con cadenas
     public int busquedaBinariaRecursiva(ArrayList<Mascotas> mascotas,String busqueda, int izquierda, int derecha) {
        //Si izquierda es mayor que derecha significa que no encontramos nada
        if (izquierda > derecha) {
            return -1;
        }
        //Calculamos las mitades
        int indiceDelElementoDelMedio = (int)Math.floor((izquierda + derecha)/2);
        String elementoDelMedio = String.valueOf(indiceDelElementoDelMedio);

        //Primero vamos a comparar y luego vamos a ver si el resultado es negativo, positivo o 0
        int resultadoDeLaComparacion = busqueda.compareTo(elementoDelMedio);

        //Si el resultado de la comparación es 0, significa que ambos elementos son iguales y por lo tanto,
        //hemos encontrado la búsqueda
        if (resultadoDeLaComparacion < 0) {
            return indiceDelElementoDelMedio;
        }

        //Si no, entonces vemos si está a la derecha o a la izquierda
        if (resultadoDeLaComparacion < 0) {
            derecha = indiceDelElementoDelMedio -1;
            return busquedaBinariaRecursiva(mascotas,busqueda,izquierda,derecha);
        } else {
            izquierda = indiceDelElementoDelMedio + 1;
            return busquedaBinariaRecursiva(mascotas,busqueda,izquierda,derecha);
        }
    }*/

    //Búsqueda binaria

    public int busquedaBinariaConWhile(ArrayList<Mascotas> mascotas,String busqueda) {
        int izquierda = 0;
        int derecha = mascotas.size() - 1;

        while (izquierda <= derecha) {
            //Calculamos las mitades
            int indiceDelElementoDelMedio = (int)Math.floor((izquierda + derecha)/2);
            String elementoDelMedio = String.valueOf(indiceDelElementoDelMedio);

            //Primero vamos a comparar y ver si el resultado es negativo, positivo o 0
            int resultadoDeLaComparacion = busqueda.compareTo(elementoDelMedio);

            //Si el resultado de la comparación es 0, significa que ambos elementos son iguales y, por lo tanto
            //quiere decir que hemos encontrado la búsqueda
            if (resultadoDeLaComparacion == 0) {
                return indiceDelElementoDelMedio;
            }

            //Si no, entonces vemos si está a la izquierda o derecha
            if (resultadoDeLaComparacion < 0) {
                derecha = indiceDelElementoDelMedio -1;
            } else {
                izquierda = indiceDelElementoDelMedio + 1;
            }
        }
        //Si no se rompió el ciclo ni regresó el índice, entonces el elemento no existe
        return -1;

        /*Implementación funciones
        ArrayList<Mascotas> mascota;
        String busqueda = "Kika";

        int indiceDelElementoBuscado = busquedaBinariaConWhile(mascotas, busqueda);
        sout("Con el ciclo While - El elemento buscado (" + busqueda + ") se encuentra en el indice " +
        indiceDelElementoBuscado);
         */
    }

    public void busquedaLineal(ArrayList<Mascotas> mascotas,String busqueda) {
         int indice;
         do {
             indice = mascotas.indexOf(busqueda);
             System.out.println("La búsqueda '" + busqueda + "' está en el índice " + indice);
         } while (indice != -1);
    }

    /*public static void menu() {
        Scanner in = new Scanner(System.in);
        int num = 0;
        do {
            menuPrincipal();

            System.out.println("\nIntroducir número de la operación deseada: ");
            num = in.nextInt();
            switch (num) {
                case 1:
                    mostrarLista();
                    break;
                case 2:
                    mostrarDatosAnimal();
                    break;
                case 3:
                    mostrarDatosTodos();
                    break;
                case 4:
                    insertarAnimal(mascotas);
                    break;
                case 5:
                    eliminarAnimal();
                    break;
                case 6:
                    vaciarInventario();
                    break;
            }
        } while (num <= 6) ;
    }
    public static void menuPrincipal() {
        System.out.println();
        System.out.println("""
                -----MASCOTAS-----
                1.-Mostrar lista de los animales (tipo y nombre).
                2.-Mostrar todos los datos de un animal en concreto.
                3.-Mostrar todos los datos de todos los animales.
                4.-Insertar un animal al inventario.
                5.-Eliminar un animal del inventario.
                6.-Vaciar el inventario.""");
    }*/
}
