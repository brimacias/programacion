package ej2oTrim.Arrays_Unidimensionales;

import java.util.Arrays;

public class Arrays_Ejercicio16 {
    public static void main(String[] args) {
        int[] numeros = new int[55];
        int posActual = 0; // Para recorres el vector

        //Para ir de 1 hasta 10
        for (int i = 0;i <= 10;i++) {
            //Insertamos los valores con Arrays.fill()
            Arrays.fill(numeros,posActual,posActual+i,i);
            posActual += i;
        }

        //Mostramos el vector
        System.out.println("Números: ");
        for (int i = 0; i < 55;i++) {
            System.out.print(" " + numeros[i]);
        }

        //Salto de línea
        System.out.println("");
    }
}
