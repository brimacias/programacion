package ej2oTrim.Arrays_Bidimensionales;

public class Arrays_EjBidimensionales {
    public static void main(String[] args) throws InterruptedException {//se añade excepcion para usar sleep
        int array[][] = new int[3][6];
        array[0][0] = 0;
        array[0][1] = 30;
        array[0][2] = 2;
        array[0][5] = 5;
        array[1][0] = 75;
        array[1][4] = 0;
        array[2][2] = -2;
        array[2][3] = 9;
        array[2][5] = 11;

        int fila;
        int columna;

        System.out.print("       ");
        for(columna = 0; columna < 6; columna++) {
            System.out.print("   Columna " + columna);
        }

        for(fila = 0; fila < 3; fila++) {

            System.out.print("\nFila " + fila +"\t");

            for(columna = 0; columna < 6; columna++) {
                //System.out.printf("%9d   ", num[fila][columna]);
                System.out.print("\t"+array[fila][columna]+"\t"+"\t");
            }
        }
    }
}

