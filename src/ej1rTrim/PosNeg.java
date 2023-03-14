package ej1rTrim;

import java.util.Scanner;

    public class PosNeg {
        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Introducir número: ");
            double num =teclado.nextDouble();
            String R;

            if(num>=0) {
                R = "POSITIVO";
            } else {
                R = "NEGATIVO";
            }

            System.out.println("El número es " + R);
    }

}
