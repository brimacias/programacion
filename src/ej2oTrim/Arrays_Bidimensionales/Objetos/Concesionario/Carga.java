package ej2oTrim.Arrays_Bidimensionales.Objetos.Concesionario;

 class Carga {
    public static void carga(Coche[] array) {
        for (int i = 0;i<(array.length-1);i++) {
            for (int j = i+1;j<array.length;j++){
                if (array[i].precioBase>array[j].precioBase) {
                    double variableAuxiliar = array[i].precioBase;
                    array[i]=array[j];
                    array[j].precioBase=variableAuxiliar;
                }
            }
        }
    }
}
