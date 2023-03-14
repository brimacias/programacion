package ej2oTrim.Arrays_Unidimensionales;

import java.util.Scanner;

public class Arrays_Ejercicio1_v2 {
    public static void main(String[] args) {

        Arrays_Ejercicio1_v2 ej1 = new Arrays_Ejercicio1_v2();
        // Variables
        double[] numeros = new double[10];

        // Creamos Scanner
        Scanner in = new Scanner(System.in);

        ej1.rellenoArray(numeros,in);

        Arrays_Ejercicio1_ClaseMetodos.rellenoArray(numeros,in);

        // Mostramos los numeros
        for (int i = 0; i < 10; i++) {
            System.out.println("Numero " + i + ": " + numeros[i]);
        }

        ej1.visionadoArray(numeros);
        Arrays_Ejercicio1_ClaseMetodos.visionadoArray(numeros);
    }

    public void rellenoArray(double[]  numeros, Scanner in){
        // Pedimos 10 numeros y los guardamos en el vector
        for (int i = 0; i < 10; i++) {
            System.out.print("Dame el valor " + i + ": ");
            numeros[i] = in.nextDouble();
        }

    }

    public void visionadoArray(double[]  numeros){
        for (double n : numeros) { // for al estilo foreach
            System.out.print(n + "  ");
        }

    }

    public static void rellenoArray_static(double[]  numeros, Scanner in){
        // Pedimos 10 numeros y los guardamos en el vector
        for (int i = 0; i < 10; i++) {
            System.out.print("Dame el valor " + i + ": ");
            numeros[i] = in.nextDouble();
        }

    }

    public static void visionadoArray_static(double[]  numeros){
        for (double n : numeros) { // for al estilo foreach
            System.out.print(n + "  ");
        }

    }
}
