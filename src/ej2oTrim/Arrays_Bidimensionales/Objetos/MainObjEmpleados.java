package ej2oTrim.Arrays_Bidimensionales.Objetos;

public class MainObjEmpleados {
    private static double sumaForEach;
    /**
    public static void main(String[] args) {
        //Creamos un array de objetos de la clase empleados
        Empleado arrayObjetos[]=new arrays.arrayObjs.Empleado[10];
        //Inicialización del array con los objetos
//Creamos 10 empleados por defecto
        int suma=0;
        for (int i=0;i<arrayObjetos.length;i++){
            arrayObjetos[i]=new arrays.arrayObjs.Empleado("emp"+i,"apellido"+i,0,600+i);
        }

        System.out.println("Visualización con Arrays.toString - SIN método toString sobreescrito ");
        System.out.println(Arrays.toString(arrayObjetos));



        System.out.println("Visualización con for");
//Lo recorremos y sumamos de nuevo los salarios (600*10)
        for (int i=0;i<arrayObjetos.length;i++){
//Mostramos la direccion del objeto
            System.out.println(arrayObjetos[i].toString());
            suma+=arrayObjetos[i].getSalario();
        }

        System.out.println("Visualización con forEach");
        for(Empleado emp:arrayObjetos){
            System.out.println(emp.toString());
        }

        System.out.println("Calculo del salario con forEach");
        for(Empleado emp:arrayObjetos){
            sumaForEach+=emp.getSalario();
        }

        System.out.println("La suma de salarios es "+suma);
        System.out.println("La suma de salarios con ForEach es "+sumaForEach);

        System.out.println("La media de salarios es "+suma/arrayObjetos.length);

        System.out.println("La media de salarios con ForEach es "+sumaForEach/arrayObjetos.length);
    }*/
}
