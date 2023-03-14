package ej2oTrim.Arrays_Bidimensionales;

public class Arrays_EjBi6 {
    public static void main(String[] args) {
        int[][] array = new int[10][10];
        int contador = 0;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10;j++) {
                contador++;
                array[0][j] = contador;
                System.out.print(" " + array[0][j] + " ");
            }
            System.out.println();
        }
    }
}
