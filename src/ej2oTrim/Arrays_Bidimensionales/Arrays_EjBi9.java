package ej2oTrim.Arrays_Bidimensionales;

import java.util.Scanner;

public class Arrays_EjBi9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int contador = 0;
        int cuantosM = 0;
        int cuantasF = 0;
        int totalM = 0;
        int totalF = 0;
        int media = 0;
        int[][] array;

        System.out.println("Introducir el número de personas: ");
        int n = in.nextInt();

        do {
            contador++;
            System.out.println("Introducir género de la persona " + contador);
            int genero = in.nextInt();
            System.out.println("Introducir el sueldo de la persona " +contador);
            int sueldo = in.nextInt();
            array = new int[genero][sueldo];
        } while (n < contador);

        for (int i = 0; i < n;i++) {
            if(array[i][0] == 0) {
                cuantosM++;
                totalM += array[i][1];
            } else if (array[i][0] == 1) {
                cuantasF++;
                totalF += array[i][1];
            }

        }


    }
}
