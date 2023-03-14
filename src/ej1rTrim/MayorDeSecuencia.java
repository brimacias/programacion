package ej1rTrim;

import java.util.Scanner;

public class MayorDeSecuencia {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num = 0;
        int maximo = 0;
        System.out.println("Introducir un número para definir la cantidad: ");
        int cantidad = teclado.nextInt();

        for (int i = 0;i < cantidad;i++) {
            if (num > maximo) {
                maximo = num;
            }
        }
        System.out.println(maximo);
    }
}
