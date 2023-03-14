package ej1rTrim;

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introducir valor de 'X': ");
        double x = teclado.nextDouble();
        System.out.println("Introducir valor de 'Y': ");
        double y = teclado.nextDouble();

        System.out.println("X= " + x);
        System.out.println("Y= " + y);

        double nueva_x = y;
        double nueva_y = x;
        System.out.println("Nuevo valor de X = " + nueva_x);
        System.out.println("Nuevo valor de Y = " + nueva_y);
    }
}
