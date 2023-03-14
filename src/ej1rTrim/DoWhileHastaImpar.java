package ej1rTrim;

import java.util.Scanner;

public class DoWhileHastaImpar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double numero;
        do {
            System.out.println("Introducir un número: ");
            numero = teclado.nextDouble();
        }while (numero % 2 ==0);
    }
}
