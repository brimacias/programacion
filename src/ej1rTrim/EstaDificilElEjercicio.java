package ej1rTrim;

import java.util.Scanner;

public class EstaDificilElEjercicio {
    //Programa que calcule el máximo, mínimo y la media de una serie de números. El programa termina
    //cuando el usuario introduzca un número primo.
    //El primo introducido no se tendrá en cuenta en los cálculos y no se cuenta al indicar cuántos números
    //se han introducido.
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;
        int maximo = 0;
        int minimo = Integer.MIN_VALUE;
        int acumulador = 0;
        int contador = 0;

        System.out.println("Introduzca números enteros positivos (primo para acabar): ");
        do {
            num = teclado.nextInt();
            if (num > maximo) {
                maximo = num;
            } else {
                minimo = num;
            }
            acumulador = acumulador + num;
            contador++;

        } while (!esPrimo(num) && esPositivo(num));
        int media = acumulador / contador;
        System.out.println("Máximo de los números: " + maximo +
                "\nMínimo de los números: " + minimo + "\nMedia (menos el primo): " + (acumulador-num)/(contador-1)
                + "\nCantidad de números introducidos: " + (contador -1));
    }

    static boolean esPrimo(int num) {
        boolean primo = true;
        int c=num-1;
        while(primo && c>1){
            if (num%c==0) {
                primo=false;
            }
            c--;
        }
        return primo;
    }

    static boolean esPositivo(int num) {
        boolean positivo;
        if (num % 2 == 1) {
            positivo = false;
        } else {
            positivo = true;
        }
        return positivo;
    }
}
