package ej1rTrim;

import java.util.Scanner;

public class PrimosEntre1yN {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int limite = 1;
        int numPrimos = 0;
        boolean primo = true;
        System.out.println("Escribir un número positivo(para establecer el límite): ");
        int numero = teclado.nextInt();
        if (numero < limite) {
            System.out.println("El límite tiene que ser mayor que el 1.");
            numero = teclado.nextInt();
        } else if (esPrimo(numero)) {
            numPrimos++;
        } else if (!esPrimo(numero)) {
            System.out.println("No hay números primos entre 1 y " + numero);
        }
        System.out.println("Hay " + numPrimos++ + " números primos.");
    }

    static boolean esPrimo(int numero) {
        boolean primo = true;
        int c=numero-1;
        while(primo && c>1){ // for(int c=numero-1;primo && c>1;c--)
            if (numero%c==0) {
                primo=false;
            }
            c--;
        }
        return primo;
    }
    /**
     *          while (primo && c > 1) {
     *                 if (numero % c == 0) {
     *                     primo = false;
     *                 } else {
     *                     primo = true;
     *                 }
     *                 c--;
     *             }
     */
}
