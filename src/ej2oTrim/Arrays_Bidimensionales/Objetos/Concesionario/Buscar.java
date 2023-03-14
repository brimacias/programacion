package ej2oTrim.Arrays_Bidimensionales.Objetos.Concesionario;

public class Buscar {
    public static double buscaDicotomica(Coche[] coche) {
        Coche[] array;
        int minLimit;
        int maxLimit;
        int value;
        /******
        if (maxLimit >= 0 && array[minLimit].precioBase <= value && array[maxLimit].precioBase >= value) {

            int mid = getMidValue(minLimit, maxLimit);

            System.out.println(String.format("Límite inferior %d límite superior %d valor en el arreglo %d valor a buscar %d", minLimit,maxLimit,array[mid],value));

            if (array[mid].precioBase == value) {

                return array[mid].precioBase;

            } else if (array[mid] <span data-mce-type="bookmark"id="mce_SELREST_start"data-mce-style="overflow:hidden;line-height:0"
                            style="overflow:hidden;line-height:0"></span>< value) {

                return binarySearch(array, mid + 1, maxLimit, value);

            }

            return binarySearch(array, minLimit, mid - 1, value);

        }
            *******/
        return -1;
    }
    public static int getMidValue(int minLimit, int maxLimit) {

        return (maxLimit + minLimit) / 2;

    }


}
