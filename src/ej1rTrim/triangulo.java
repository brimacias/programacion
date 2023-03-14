package ej1rTrim;

import java.util.Scanner;

public class triangulo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escoger una de las opciones: " +
                "\n1. Equilátero." + "\n2. Isósceles." + "\n1. Escaleno.");
        String tipo = teclado.nextLine();
        System.out.println("Introducir uno de los lados del triángulo: ");
        double lado1 = teclado.nextDouble();
        System.out.println("Introducir otro de los lados del triángulo: ");
        double lado2 = teclado.nextDouble();
        System.out.println("Introducir el otro de los lados del triángulo: ");
        double lado3 = teclado.nextDouble();

        double perimetro = lado1 + lado2 + lado3;

        System.out.println("El perimetro del triángulo es " + perimetro);

    }
}
