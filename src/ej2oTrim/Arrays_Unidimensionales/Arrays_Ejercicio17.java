package ej2oTrim.Arrays_Unidimensionales;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_Ejercicio17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero;
        boolean iguales;
        int[] array1 = new int[10];
        int[] array2 = new int[10];

        for (int i = 0; i < array1.length;i++) {
            System.out.println("Dame el valor " + i + ": ");
            array1[i] = in.nextInt();
        }

        for (int j = 0; j < array2.length;j++) {
            System.out.println("Dame el valor " + j + ": ");
            array2[j] = in.nextInt();
        }

        iguales = Arrays.equals(array1,array2);

        //Mostramos si son iguales
        if (iguales) {
            System.out.println("Los arrays son iguales.");
        } else {
            System.out.println("Los arrays son distintos.");
        }
    }
}
