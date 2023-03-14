package ej1rTrim;

import java.util.Scanner;

public class cuadradoNumero {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introducir número: ");
        double num = teclado.nextDouble();
        double elevado = Math.pow(num,2);
        System.out.println("El cuadrado del número es " + elevado);
        do {
            System.out.println("Introducir otro número: ");
            num = teclado.nextDouble();
            elevado = Math.pow(num,2);
            System.out.println("El cuadrado del número es " + elevado);
        } while (num >= 0);
    }
}
