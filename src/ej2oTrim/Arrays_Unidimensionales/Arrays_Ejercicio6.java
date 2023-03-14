package ej2oTrim.Arrays_Unidimensionales;

import java.util.Scanner;

public class Arrays_Ejercicio6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Introducir un valor entero (tamaño del array): ");
        int tamN = in.nextInt();
        System.out.println("Introducir un valor entero (número posiciones array): ");
        int valorM = in.nextInt();

        double[] array = new double[tamN];

        for (int i = 0; i < tamN;i++) {
            array[i] = valorM;
            System.out.print(array[i] + ", ");
        }

    }
}
