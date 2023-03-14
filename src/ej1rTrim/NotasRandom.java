package ej1rTrim;

import java.util.Random;

public class NotasRandom {
    public static void main(String[] args) {
        Random r = new Random();
        // Entre 0 y 10 excluido, más 1, es decir, del 1 al 10 ambos incluidos.
        int contador = 0;
        int nota = r.nextInt(7)+1;
        String numCadena = String.valueOf(nota);
        for (int i = 4;i<28;i++) {
            switch (nota) {
                case 1:
                    numCadena = "do ";
                    break;
                case 2:
                    numCadena = "re ";
                    break;
                case 3:
                    numCadena = "mi ";
                    break;
                case 4:
                    numCadena = "fa ";
                    break;
                case 5:
                    numCadena = "sol ";
                    break;
                case 6:
                    numCadena = "la ";
                    break;
                case 7:
                    numCadena = "si ";
                    break;
            }
        }
        contador++;

        do {
              System.out.println("|");
        } while (contador % 4 == 0);

            System.out.print(numCadena + " ");

    }
}
