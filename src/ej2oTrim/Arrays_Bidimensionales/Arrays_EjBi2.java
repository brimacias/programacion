package ej2oTrim.Arrays_Bidimensionales;

import java.util.Scanner;

public class Arrays_EjBi2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero = 0;
        int suma = 0;
        for (int i = 0; i < 20;i++) {
            System.out.println("Introducir número entero: ");
            numero = teclado.nextInt();
        }

        int[][] array = new int[4][5];

        int fila;
        int columna;
        suma += numero;

        System.out.print("       ");
        for(columna = 0; columna < 4; columna++) {
            System.out.print("   Columna " + columna);
        }

        for (fila = 0;fila < 5;fila++) {
            System.out.print("\nFila " + fila +"\t");
            for (columna = 0; columna < 4;columna++) {
                System.out.print("\t"+array[fila][columna]+"\t"+"\t");
            }
        }
    }
}
