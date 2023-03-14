package ej1rTrim;

import java.util.Scanner;

public class principalBiblioteca {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Biblioteca l1 = new Biblioteca("octubre",23,"Crónica de una muerte anunciada", (byte) 5, 89);


        System.out.println("El libro " + l1.getTit() + " se consultó " + l1.getNc() + " veces.");
        System.out.println("La tasa de consulta en el mes de " + l1.getMes() + " es " + l1.getTasa() +
                            " %.");
    }
}
