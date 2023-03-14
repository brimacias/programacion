package ej2oTrim.Cadenas;

import java.util.Scanner;

public class CadenasEj1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introducir una cadena de texto: ");
        String cadena = in.nextLine();

        String mayus = cadena.toUpperCase();
        String minus = cadena.toLowerCase();

        System.out.println("Cadena en mayúsculas: " + mayus);
        System.out.println("Cadena en minúsculas: " + minus);
    }
}
