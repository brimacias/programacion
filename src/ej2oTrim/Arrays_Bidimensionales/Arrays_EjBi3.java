package ej2oTrim.Arrays_Bidimensionales;

public class Arrays_EjBi3 {
    /*
    Realiza un programa que rellene un array de 6 filas por 10 columnas:
        *    con números enteros positivos comprendidos entre 0 y 1000 (ambos incluidos).
        *    el programa deberá dar la posición tanto del máximo como del mínimo.
     */
    public static void main(String[] args) {
        int[][] array = new int[6][10];
        int numero1 = (int)(Math.random()*10);
        int numero2 = (int)(Math.random()*1000);

        for (int i = 0; i < 6; i++) {
            for (int j = 0;j < 10;j++) {
                if (numeroValido(numero1)) {
                    array[0][j] = numero1*j;
                    System.out.print(" " + array[0][j] + " ");
                }
            }
            if (numeroValido(numero2)) {
                array[i][0] = numero2*i;
                System.out.println();
                System.out.print(" " + array[i][0] + " ");
            }
        }
        System.out.print(numeroMaximo(numero1,numero2));
        System.out.println(numeroMinimo(numero1,numero2));
    }

    public static boolean numeroValido(int numero) {
        boolean valido;
        if (numero >= 0 && numero <= 1000) {
            valido = true;
        } else {
            valido = false;
        }
        return valido;
    }

    public static int numeroMaximo(int numero1,int numero2) {
        int maximo = 0;
        if (numero1 > maximo) {
            maximo = numero1;
        } else if (numero2 > maximo) {
            maximo = numero2;
        }
        return maximo;
    }

    public static int numeroMinimo(int numero1,int numero2) {
        int minimo = 0;
        if (numero1 < minimo) {
            minimo = numero1;
        } else if (numero2 < minimo) {
            minimo = numero2;
        }
        return minimo;
    }
}
