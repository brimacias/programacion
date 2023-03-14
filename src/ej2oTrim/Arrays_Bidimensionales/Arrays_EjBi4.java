package ej2oTrim.Arrays_Bidimensionales;

import java.util.Scanner;

public class Arrays_EjBi4 {
    //Crear una matriz de n * m filas. Imprimir la matriz completa y la última fila.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Introducir 'n': ");
        int n = in.nextInt();
        System.out.println("Introducir 'm': ");
        int m = in.nextInt();

        int[][] array = new int[n][m];

        for (int i = 0; i < n;i++) {
            for (int j = 0; j < m;j++) {
                array[i][j] = (int)(Math.random()*10);
                System.out.print(" " + array[0][j] + " ");
            }
            System.out.println();
        }
    }
}
