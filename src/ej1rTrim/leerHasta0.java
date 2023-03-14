package ej1rTrim;

import java.util.Scanner;

public class leerHasta0 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double num = 1;
        while (num != 0) {
            System.out.println("Introducir un número: ");
            num = teclado.nextDouble();
            if (num % 2 == 0) {
                System.out.println("Es par.");
            } else {
                System.out.println("Es impar.");
            }
        }
    }
}
