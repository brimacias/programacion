package ej2oTrim.Arrays_Bidimensionales;

public class Arrays_EjBi5 {
    //Crea un programa que cree una matriz de tamaño 5x5 que almacene los números del 1 al 25.
    public static void main(String[] args) {

        int[][] array = new int[5][5];
        int contador = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5;j++) {
                contador++;
                array[0][j] = contador;
                System.out.print(" " + array[0][j] + " ");
            }
            System.out.println();
        }
    }
}
