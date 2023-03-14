package ej2oTrim.ArrayList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class EJ1Producto {
    String nombre;
    float precioVigo;
    float precioSantiago;
    float precioMadrid;

    public EJ1Producto(String nombre, float precioVigo, float precioSantiago, float precioMadrid) {
        this.nombre = nombre;
        this.precioVigo = precioVigo;
        this.precioSantiago = precioSantiago;
        this.precioMadrid = precioMadrid;
    }

    public static void anadirObjetos(ArrayList<EJ1Producto> lista) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introducir nombre del producto: ");
        String nombre = in.nextLine();
        System.out.println("Introducir el precio del producto en Vigo: ");
        float precioVigo = in.nextFloat();
        System.out.println("Introducir el precio del producto en Santiago: ");
        float precioSantiago = in.nextFloat();
        System.out.println("Introducir el precio del producto en Madrid: ");
        float precioMadrid = in.nextFloat();
        lista.add(lista.size()+1,new EJ1Producto(nombre,precioVigo,precioSantiago,precioMadrid));
    }

    public static void borrarObjeto(ArrayList<EJ1Producto> lista) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introducir el número del producto que se quiere eliminar: ");
        int numero = in.nextInt();
        lista.remove(numero);
    }

    public static void listarProductos(ArrayList<EJ1Producto> lista) {
        System.out.println(lista);
    }

    public static void sumarFilas(ArrayList<EJ1Producto> lista) {
        int suma = 0;
        for (int i = 0; i < lista.size();i++) {
            //suma = suma + ;
        }
        System.out.println("La suma de las filas es de " + suma);
    }

    public static void clasificar(ArrayList<EJ1Producto> lista) {

    }

    public static void buscarProducto(ArrayList<EJ1Producto> lista) {
        Scanner in = new Scanner(System.in);
        EJ1Producto[] lista2 = (EJ1Producto[]) lista.toArray();

        System.out.println("Introducir el número del producto que se busca: ");
        int numero = in.nextInt();
        int resultado = Arrays.binarySearch(lista2,numero);
        System.out.println(String.format("Resultado %d", resultado));
    }


}
