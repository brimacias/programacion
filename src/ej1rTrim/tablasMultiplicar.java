package ej1rTrim;

import java.util.Scanner;

public class tablasMultiplicar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introducir un número (para mostrar su tabla de multiplicar):");
        double num = teclado.nextDouble();
        System.out.println("---TABLA DE MULTIPLICAR DE " + num + "---");
        for (int i = 1;i <= 10;i++) {
            System.out.println("\n"+num + " x " + i  + " = "+ num*i);
        }


    }
}
