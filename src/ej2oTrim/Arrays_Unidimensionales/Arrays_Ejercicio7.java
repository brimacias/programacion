package ej2oTrim.Arrays_Unidimensionales;

import java.util.Scanner;

public class Arrays_Ejercicio7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int p1,q2;
        int tam = 0;

        System.out.println("Introduzca un valor entero: ");
        p1 = teclado.nextInt();
        System.out.println("Introduzca un valor entero (mayor que el anterior): ");
        q2 = teclado.nextInt();

        if (q2 > p1) {
            tam = q2 -p1;
        } else {
            System.out.println("El segundo número tiene que ser mayor que el primero.");
        }
        double[] array = new double[tam];

        for (int i = 1; i < tam; i++) {
            array[i] = p1 + i;
            System.out.print(array[i] + ", ");
        }
    }
}
