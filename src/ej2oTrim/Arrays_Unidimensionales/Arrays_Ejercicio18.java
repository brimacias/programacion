package ej2oTrim.Arrays_Unidimensionales;

public class Arrays_Ejercicio18 {
    public static void main(String[] args) {
        int[] numeros = new int[30];

        for (int i = 0; i < 30; i++) {
            numeros[i] = (int)(Math.random()*10);
            System.out.print(numeros[i] + " ,");
        }

    }
}
