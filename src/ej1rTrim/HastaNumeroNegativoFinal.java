package ej1rTrim;

import java.util.Scanner;

public class HastaNumeroNegativoFinal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //Declaración de variables
        int num;
        int contador = 0;
        int maximo = 0;
        double acumumladorImpares = 0;
        double contadorImpares = 0;
        double mediaImpares = 0;
        //Proceso
        System.out.println("Introducir números enteros: ");
        do {
            num = teclado.nextInt();
            contador++;
            if (num % 2 != 0) {
                acumumladorImpares = acumumladorImpares + num;
                contadorImpares++;
            } else {
                if (num > maximo) {
                    maximo = num;
                }
            }
        } while (num >= 0);
        mediaImpares = acumumladorImpares/contadorImpares;

        //Salida de datos
        System.out.println("Cantidad de números que se han introducido: " + contador);
        System.out.println("Media de los impares: " + mediaImpares);
        System.out.println("Mayor de los pares: " + maximo);

    }
}
