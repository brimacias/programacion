package ej2oTrim.Arrays_Unidimensionales;

import java.util.Scanner;

public class Arrays_Ejercicio8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double[] array = new double[100];
        int contadorR = 0;

        System.out.println("Introduzca un valor: ");
        double r = in.nextDouble();

        for (int i = 0; i < 100;i++) {
            array[i] = (Math.random()*10);
            if (array[i]>=r) {
                contadorR++;
            }
            System.out.print((array[i]/10) + " ,");
        }

        System.out.println("\nHay " + contadorR + " números iguales o mayores al introducido en el array.");

    }
}
