package ej2oTrim.Arrays_Unidimensionales;

import java.util.Scanner;

public class Arrays_Ejercicio13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int contador = 0;
        System.out.println("Introducir número de valores del array: ");
        int n = teclado.nextInt();
        System.out.println("Introducir el valor inicial: ");
        int v = teclado.nextInt();
        System.out.println("Introducir el valor del incremento: ");
        int incremento = teclado.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = v + incremento;
            System.out.print((array[i]) + " ,");
        }
    }
}
