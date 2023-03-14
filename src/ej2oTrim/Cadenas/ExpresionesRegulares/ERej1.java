package ej2oTrim.Cadenas.ExpresionesRegulares;

import java.util.Scanner;

public class ERej1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Introducir DNI: ");
        String dni = in.nextLine();

        if (dni.matches("[0-9]{8}[A-Z]")) {
            System.out.println("El DNI introducido es válido.");
        } else {
            System.out.println("El DNI no es válido.");
        }

    }
}
