package ej1rTrim;

import java.util.Scanner;

public class viaje_estudios {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introducir el número de alumnos: ");
        int numAlum = teclado.nextInt();
        double costo;
        double costoAlum;

        if (numAlum >= 100) {
            costoAlum = 65.0;
            System.out.println("El coste a pagar por alumno es de " + costoAlum + "€, y el total es " + (costoAlum*numAlum) +"€");
        } else if (numAlum >= 50 && numAlum <= 99) {
            costoAlum = 70.0;
            System.out.println("El coste a pagar por alumno es de " + costoAlum + "€, y el total es " + (costoAlum*numAlum) +"€");
        } else if (numAlum >= 30 && numAlum <= 49) {
            costoAlum = 95.0;
            System.out.println("El coste a pagar por alumno es de " + costoAlum + "€, y el total es " + (costoAlum*numAlum) +"€");
        } else if (numAlum < 30) {
            costo = 4000.0;
            System.out.println("Como el número de alumnos es de menos de 30, el precio es de " + costo);
        }

    }
}
