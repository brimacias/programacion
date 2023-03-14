package ej1rTrim;

import java.util.Scanner;

public class calcetinesNavidad {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int contador = 0;
        int i = 0;
        System.out.println("Introducir la altura de los calcetines: ");
        int altura = teclado.nextInt() - 2;

        do {
            System.out.println("***     " + "***");
            contador++;
        } while (contador < altura);

        do {
            System.out.println("******  " + "******");
            i++;
        } while (i != 2);


    /**
     * public String relojArena() {
     *         Scanner leer = new Scanner(System.in);
     *         int contador = 0;
     *         System.out.println("Introducir la altura de el reloj: ");
     *         int altura = leer.nextInt();
     *         do {
     *             System.out.println("*");
     *             contador++;
     *         }while (contador < altura);
     *         return "";
     * @return
     */

    }
}
