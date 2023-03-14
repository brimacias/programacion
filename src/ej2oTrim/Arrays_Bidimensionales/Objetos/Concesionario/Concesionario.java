package ej2oTrim.Arrays_Bidimensionales.Objetos.Concesionario;

import java.util.Scanner;

 class Concesionario {
    public static void main(String[] args) {
        Coche[] array = new Coche[100];

        for (int i = 0;i<array.length;i++) {
            array[i] = new Coche("marca"+i,"modelo"+i,7600+i,true,
                    "cierre central","pintura","motor de coche :v");
        }

        menu(array);

        /*
        for(Coche coche:array){
            System.out.println(coche.toString());
        }*/
    }

    public static void menu (Coche[] array){
        Scanner input = new Scanner(System.in);
        System.out.println("Inicialización del Sistema");
        byte op = 0;

        do {
            menuPrincipal();
            op = leerByte(input);
            switch (op) {
                case 2:
                    Ordenar.MayorMenorBurbuja(array);//ordenado por marca
                    Ver.verArray(array);
                    break;
                    //coche más caro
                case 3:
                    Ordenar.MayorPrecio(array);//ordenación secuencial por precio_base
                    break;
                case 4:
                    Buscar.buscaDicotomica(array);//búsqueda binaria o dicotómica
                    break;
                case 1:
                case 5:
                    Ver.verArray(array);
                    break;
                case 0:
                    fin();
            }
        } while (op != 0);
        //Cierre de la conexión
        input.close();
    }

    public static byte leerByte(Scanner sc) {

        byte valor = 0;
        boolean correcto;

        correcto = true;

        do {
            valor = sc.nextByte();
            if (valor<0||valor>5) {
                System.out.println("ERROR. No ha introducido un valor válido. Introduzca un número: ");
                correcto=false;
            }
            else correcto=true;
        } while (!correcto);

        return valor;

    }

    public static void menuPrincipal() {
        System.out.println("----------------------------------------------\n"
                + "\t\t\tPROYECTO COCHE\n\n"
                + "1.-Listado ordenado\n"
                + "2.-Uso método burbuja (de mayor a menor)\n"
                + "3.-Ordenación secuencial por precio_base\n"
                + "4.-Búsqueda binaria o dicotómica\n"
                + "5.-Visualizar información del coche\n\n"
                + "0.-SALIR");
    }

    public static void fin() {
        System.out.println("PROGRAMA FINALIZADO");
    }
}