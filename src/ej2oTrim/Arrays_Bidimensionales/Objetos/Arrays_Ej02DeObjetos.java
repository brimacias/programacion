package ej2oTrim.Arrays_Bidimensionales.Objetos;

public class Arrays_Ej02DeObjetos {
    public static void main(String[] args) {
        EmpleadoAulaVirtual[] array = new EmpleadoAulaVirtual[10];
        /**
         *         array[0] = new Empleado("Miguel","León",43,3400);
         *         array[1] = new Empleado("Francisco","Rodríguez Blanco",28,2000.5);
         *         array[2] = new Empleado("Marta","García Pardo",34,2370.2);
         *         array[3] = new Empleado("Alberto","Ribera Martínez",25,1890);
         *         array[4] = new Empleado("Guillermo","Mur Ruiz",30,3000);
         *         array[5] = new Empleado("Elisa","Márquez Lago",33,3000.4);
         *         array[6] = new Empleado("Javier","Prado Novas",35,3500);
         *         array[7] = new Empleado("Laura","López Martín",24,2000);
         *         array[8] = new Empleado("Margarita","Infantes Peláez",31,2500.7);
         *         array[9] = new Empleado("Amaya","Rivas Ferreiro",33,2600.4);
         */


        double suma = 0;
        double sumaForEach = 0;

        for (int i = 0;i<array.length;i++) {
            array[i] = new EmpleadoAulaVirtual("emp"+i,"apellido"+i,0,600+i);
        }

        System.out.println("Calculo de la suma del salario con forEach");
        for (EmpleadoAulaVirtual emp:array) {
            sumaForEach = emp.getSalario();
        }

        System.out.println("La suma de salarios es" + suma);
        System.out.println("La suma de los salarios con ForEach es " +sumaForEach);
        System.out.println("La media de salarios es " + suma/array.length);
    }
}

class Empleado_02 {
    String nombre;
    String apellidos;
    int edad;
    double salario;


    public Empleado_02(String nombre, String apellidos, int edad, double salario) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", edad=" + edad +
                ", salario=" + salario +
                '}';
    }

    public double getSalario() {
        return salario;
    }
}
