package ej1rTrim;

import java.util.Scanner;

public class SueldoMaximo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introducir el número de sueldos: ");
        int numSueldos = teclado.nextInt();
        for (int i = 0; i < numSueldos; i++) {
            System.out.println("Introducir sueldo: ");
            double sueldo = teclado.nextDouble();
        }
    }
}
