package ej1rTrim;

import java.util.Scanner;

public class NumeroDe0 {
    public static void main(String[] args) {
        contadorNumeros();
    }

    public static void contadorNumeros() {
        Scanner teclado = new Scanner(System.in);
        //Declaración de los contadores
        int contador = 0;
        int contadorMayor = 0;
        int contadorMenor = 0;
        int contador0 = 0;

        System.out.println("Introduzca la cantidad de números: ");
        int cantidad = teclado.nextInt();
        //Hacer el bucle mientras el contador general no sea igual a la cantidad introducida
        do {
            System.out.println("Introducir " + cantidad + " números: ");
            int numero = teclado.nextInt();
            contador++;

            if (numero > 0) {
                contadorMayor++;
            } else if (numero < 0) {
                contadorMenor++;
            } else {
                contador0++;
            }
        }while (contador != cantidad);
        System.out.println("Hay " + contadorMayor + " número(s) mayor(es) que 0." +
                "\nHay " + contadorMenor + " número(s) menor(es) que 0." +
                "\nHay " + contador0 + " cero(s).");

    }
}
