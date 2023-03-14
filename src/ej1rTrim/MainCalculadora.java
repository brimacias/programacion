package ej1rTrim;

import java.util.Scanner;

public class MainCalculadora {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Calculadora c1 = new Calculadora();
        System.out.println("Introducir una letra para una operación (S = suma | R = resta | M = multiplicacion |" +
                " D = division)");
        String operacion = teclado.nextLine();
        if (operacion == "S") {
            System.out.println("Introducir dos números para sumar: ");
            double num1 = teclado.nextDouble();
            double num2 = teclado.nextDouble();
            System.out.println("La suma de los números es " + c1.suma(num1,num2) + ".");
        } else if (operacion == "R") {
            System.out.println("Introducir dos números para restar: ");
            double num1 = teclado.nextDouble();
            double num2 = teclado.nextDouble();
            System.out.println("La resta de los números es " + c1.resta(num1,num2) + ".");
        } else if (operacion == "M") {
            System.out.println("Introducir dos números para multiplicar: ");
            double num1 = teclado.nextDouble();
            double num2 = teclado.nextDouble();
            System.out.println("La multiplicación de los números es " + c1.multiplicacion(num1,num2) + ".");
        } else if (operacion == "D") {
            System.out.println("Introducir dos números para dividir: ");
            double num1 = teclado.nextDouble();
            double num2 = teclado.nextDouble();
            System.out.println("La división de los números es " + c1.division(num1,num2) + ".");
        }

    }
}
