package ej2oTrim.Arrays_Bidimensionales;

import java.util.Scanner;

public class Arrays_EjBi7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int contador0 = 0;
        int contadorMenor0 = 0;
        int contadorMayor0 = 0;

        System.out.println("Introducir 'n': ");
        int n = in.nextInt();
        System.out.println("Introducir 'm': ");
        int m = in.nextInt();

        int[][] array = new int[n][m];

        /*
        System.out.println("Introducir un valor: ");
        int v1 = in.nextInt();
        System.out.println("Introducir otro valor: ");
        int v2 = in.nextInt();
        */

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = (int)(Math.random()*10);
                System.out.print(" " +array[0][j] + " ");
                if (array[0][j] == 0) {
                    contador0++;
                } else if (array[0][j] < 0) {
                    contadorMenor0++;
                } else if (array[0][j] > 0) {
                    contadorMayor0++;
                }
            }
            System.out.println();
        }
        System.out.println("Número de menores que 0: " + contadorMenor0 +
                "Números de 0: " + contador0 +
                "Números de mayores que 0: " + contadorMayor0);
    }
}
