package ej1rTrim;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introducir el radio de la circunferencia: ");
        double radio = teclado.nextDouble();
        double longitud = 2 * Math.PI * radio;
        System.out.println("La longitud de la circunferencia es de " + longitud + ".");
    }
}
