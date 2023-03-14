package ej2oTrim.Arrays_Bidimensionales.Objetos;

public class EmpleadoAulaVirtual {
    public String nombre;
    public String apellido;
    public int edad;
    private double salario;
    public EmpleadoAulaVirtual(String nombre, String apellido, int edad, double salario) {
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
        this.salario=salario;
    }

    public EmpleadoAulaVirtual() {

    }

    public double getSalario() {
        return salario;
    }

    /*
    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", salario=" + salario +
                '}';
    }
     */
}
