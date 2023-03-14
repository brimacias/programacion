package ej1rTrim;

import java.util.Scanner;

public class pedirNumerosHasta0 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double num = 0;
        int contador = 0;
        while (num >= 0) {
            System.out.println("Introducir número (negativo para terminar): ");
            num = teclado.nextDouble();
            contador++;
        }
        System.out.println("Se han introducido " + contador + " números.");
    }
}
