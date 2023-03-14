package ej2oTrim.Arrays_Unidimensionales;

import java.util.Scanner;

public class Arrays_Ejercicio4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Variables
        double[] numeros = new double[20];
        double total = 0;

        // Pedimos 20 numeros y los guardamos en el vector
        for (int i = 0; i < 20; i++) {
            System.out.print("Dame el valor " + i + ": ");
            numeros[i] = in.nextDouble();
        }
        suma(numeros);
    }

    public static void suma(double[] numeros) {
        double sumaPos = 0;
        double sumaNeg = 0;

        for (int i = 0; i < 20;i++) {
            if (numeros[i]>0) {
                sumaPos = sumaPos + numeros[i];
            } else {
                sumaNeg = sumaNeg + numeros[i];
            }
        }
        System.out.println("Suma de los números positivos: " + sumaPos +
                "\nSuma de los números negativos: " + sumaNeg);
    }
}
