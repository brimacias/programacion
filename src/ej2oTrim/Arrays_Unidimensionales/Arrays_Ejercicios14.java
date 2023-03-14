package ej2oTrim.Arrays_Unidimensionales;

public class Arrays_Ejercicios14 {
    public static void main(String[] args) {
         int[] numeros = new int[55];
         int posActual = 0; // Para recorres el vector

         //Para ir de 1 hasta 10
         for (int i = 0;i <= 10;i++) {
             //Insertamos i veces el valor i
             for (int j = 0;j <= i;j++) {
                 numeros[posActual] = i;
                 posActual++;
             }
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
