
package ej2oTrim.Arrays_Bidimensionales.Objetos.Concesionario;

public class Ordenar {
    public static void MayorPrecio(Coche[] array) {
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

    public static void MayorMenorBurbuja(Coche[] array) {
        int cuentaIntercambios = 0;
        for (boolean ordenado=false;!ordenado;) {
            for (int i = 0;i<array.length-1;i++) {
                if (array[i].precioBase>array[i+1].precioBase){
                    double variableAuxiliar = array[i].precioBase;
                    array[i]=array[i+1];
                    array[i+1].precioBase=variableAuxiliar;
                    cuentaIntercambios++;
                }
            }
            if (cuentaIntercambios==0) {
                ordenado = true;
            }
            cuentaIntercambios = 0;
        }
    }
}
