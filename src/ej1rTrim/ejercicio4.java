package ej1rTrim;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introducir salario del empleado: ");
        double salario = teclado.nextDouble();
        double menos20 = salario - (salario * 0.2);
        System.out.println("El salario introducido es de " + salario + "€.");
        System.out.println("Después de aplicar la retención del 20%, el salario es de " + menos20 + "€.");
    }
}
