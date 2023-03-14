package ej2oTrim.Arrays_Unidimensionales;

import java.util.Scanner;

public class Arrays_Ejercicio5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double contador = 0;

        // Variables
        double[] numeros = new double[20];
        double total = 0;

        // Pedimos 20 numeros y los guardamos en el vector
        for (int i = 0; i < 20; i++) {
            System.out.print("Dame el valor " + i + ": ");
            numeros[i] = in.nextDouble();
        }

        media(numeros);
    }

    public static void media(double[] numeros) {
        double suma = 0;
        double media = 0;

        for (int i = 0; i < 20; i++) {
            suma += numeros[i];
        }
        media = suma/20;

        System.out.println("La media de los números: " + media);
    }
}
