package ej2oTrim.Arrays_Unidimensionales;

import java.util.Scanner;

public class Arrays_Ejercicio1_ClaseMetodos {

    public static void rellenoArray(double[]  numeros, Scanner in){
        // Pedimos 10 numeros y los guardamos en el vector
        for (int i = 0; i < 10; i++) {
            System.out.print("Dame el valor " + i + ": ");
            numeros[i] = in.nextDouble();
        }

    }

    public static void visionadoArray(double[]  numeros){
        for (double n : numeros) { // for al estilo foreach
            System.out.print(n + "  ");
        }

    }
}
