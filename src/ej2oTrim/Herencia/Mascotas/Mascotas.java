package ej2oTrim.Herencia.Mascotas;


public abstract class Mascotas {
    private String nombre;
    private int edad;
    private String estado;
    private String fechaNacimiento;

    public Mascotas(String nombre, int edad, String estado, String fechaNacimiento) {
        this.nombre = nombre;
        this.edad = edad;
        this.estado = estado;
        this.fechaNacimiento = fechaNacimiento;
    }

    public void muestra() {}

    public void habla() {}

    public void morir() {
        this.estado = "Ce murió T-T";
    }

    public void cumpleanos() {
        //System.out.println("El cumpleaños de la mascota es " + fechaNacimiento.getDay() + "/" + fechaNacimiento.getMonth());
        this.edad = this.edad + 1;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }
}
