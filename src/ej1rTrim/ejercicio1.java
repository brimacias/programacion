package ej1rTrim;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introducir un número: ");
        int num = teclado.nextInt();
        System.out.println("El número leído es " + num + ".");
        System.out.println("El doble del número es " + num*2 + ".");
        System.out.println("El triple del número es " +num*3 + ".");
    }
}
