package ej2oTrim.Arrays_Unidimensionales;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_Ejercicio15 {
    public static void main(String[] args) {
        int n,m;
        int[] numeros;

        Scanner in = new Scanner(System.in);

        System.out.println("N: ");
        n = in.nextInt();
        System.out.println("M: ");
        m = in.nextInt();

        numeros = new int[n];

        Arrays.fill(numeros, m);

        System.out.println(Arrays.toString(numeros));
    }
}
