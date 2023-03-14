package ej2oTrim.Cadenas.ExpresionesRegulares;

import java.util.Scanner;

public class ERej2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introducir ISBN: ");
        String isbn = in.nextLine();

        if (isbn.matches("[0-9]{13}")) {
            System.out.println("El ISBN es correcto.");
        } else {
            System.out.println("El ISBN no es correcto.");
        }
    }
}
