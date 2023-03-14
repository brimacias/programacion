package ej2oTrim.Cadenas.ExpresionesRegulares;

import java.util.Scanner;

public class ERej3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introducir número de teléfono (con espacios):");
        String telefono = in.nextLine();

        if (telefono.matches("[0-9]{3}-[0-9]{2}-[0-9]{2}-[0-9]{2}")) {
            System.out.println("La cadena tiene formato de número de teléfono.");
        } else {
            System.out.println("La cadena no tiene formato de número de teléfono.");
        }
    }
}
