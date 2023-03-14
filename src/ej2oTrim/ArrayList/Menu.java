package ej2oTrim.ArrayList;


import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public static void menu(ArrayList<EJ1Producto> lista) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inicialización del Sistema");
        byte op = 0;

        do {
            menuPrincipal();
            op = leerByte(input);
            switch (op) {
                case 1:
                    EJ1Producto.anadirObjetos(lista);
                    //añadir objetos
                case 2:
                    EJ1Producto.borrarObjeto(lista);
                    //borrar objeto
                case 3:
                    EJ1Producto.listarProductos(lista);
                    //listar productos
                case 4:
                    EJ1Producto.sumarFilas(lista);
                    //media de cada precio producto en las tres ciudades
                case 5:
                    EJ1Producto.clasificar(lista);
                    //clasificar productos por ascendente/descendente
                case 6:
                    EJ1Producto.buscarProducto(lista);
                    //búsqueda (dicotómica)
                case 7:
                    fin();
            }
        } while (op != 0);
        input.close();
    }

    public static byte leerByte(Scanner sc) {
        byte valor = 0;
        boolean correcto;
        correcto = true;

        do {
            valor = sc.nextByte();
            if (valor<1||valor>7) {
                System.out.println("ERROR. No ha introducido un valor válido. Introduzca un número: ");
                correcto=false;
            }
            else correcto=true;
        } while (!correcto);
        return valor;
    }

    public static void menuPrincipal() {
        System.out.println("----------------------------------------------\n"
                + "\t\t\tMENÚ\n\n"
                + "1.-Añadir objetos a la colección.\n"
                + "2.-Borrar objeto de la colección"
                + "3.-Listar los producto almacenados\n"
                + "4.-Sumar filas\n"
                + "5.-Clasificar por productos/ordenación ascendente/descendente\n"
                + "6.-Buscar un producto\n"
                + "7.-SALIR");
    }
    public static void fin() {
        System.out.println("PROGRAMA FINALIZADO");
    }
}
