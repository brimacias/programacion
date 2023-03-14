package ej1rTrim;

import java.util.Scanner;

public class langosta_ahumada {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double costo = 95.0;
        System.out.println("Introducir el número de clientes: ");
        int numPersonas = teclado.nextInt();

        if (numPersonas > 200 && numPersonas <= 300) {
            costo = 85.0;
        } else if (numPersonas > 300) {
            costo = 75.0;
        }

        double precio = numPersonas * costo;
        System.out.println("El presupuesto es de " + precio + "€.");
    }
}
