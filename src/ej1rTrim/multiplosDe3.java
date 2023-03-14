package ej1rTrim;

import java.util.Scanner;

public class multiplosDe3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introducir 5 números: ");
        boolean multiplo;
        for (int i = 0; i < 5; i++) {
            double num = teclado.nextDouble();
            if (num % 3 == 0) {
                multiplo = true;
                System.out.println(multiplo);
            }
        }
        /**
         * else {
         *        multiplo = false;
         *        System.out.println(multiplo + "\nNo hay ningun número múltiplo de 3.");
         *      }
         */
    }
}

