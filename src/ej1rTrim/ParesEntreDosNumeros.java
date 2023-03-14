package ej1rTrim;

import java.util.Scanner;

public class ParesEntreDosNumeros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float numero = 0;
        int contador = 0;
        float minimo = 0;
        float maximo = 0;
        float suma = 0;
        System.out.println("Introduzca un número: ");
        float num1 = teclado.nextFloat();
        System.out.println("Introduzca un número (mayor que el anterior):");
        float num2 = teclado.nextFloat();
        if (num1 < num2) {
            minimo= num1;
            maximo = num2;
        } else {
            minimo = num2;
            maximo = num1;
        }

        for (float i =minimo+1;i<maximo;i++) {
            if (esPar(i)) {
                System.out.println(i);
                contador++;
                suma = suma + i;
            }
        }
        System.out.println("Cantidad de pares: " + contador);
        System.out.println("Suma de pares: " + suma);
    }

    public static boolean esPar(float num) {
        boolean positivo = false;
        if (num%2==0) {
            positivo = true;
        }
        return positivo;
    }
}
