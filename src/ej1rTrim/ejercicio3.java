package ej1rTrim;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introducir base: ");
        double base = teclado.nextDouble();
        System.out.println("Introducir altura: ");
        double altura = teclado.nextDouble();

        double area = base * altura;
        double perimetro = (base*2) + (altura*2);

        System.out.println("El área de la finca es de " + area + " m2.");
        System.out.println("El perímetro de la finca es de " + perimetro + " m.");
    }
}
