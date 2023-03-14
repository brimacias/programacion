package ej2oTrim.Cadenas;

import java.util.Scanner;

public class CadenasEj2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introducir dos cadenas de texto: ");
        String cadena1 = in.nextLine();
        String cadena2 = in.nextLine();

        if (cadena1.equals(cadena2)) {
            System.out.println("Las cadenas son iguales.");
        } else {
            System.out.println("Las cadenas son diferentes.");
        }
    }
}
