package ej2oTrim.Herencia.Mascotas;

public class Canario extends Aves{
    private String color;
    private boolean canta;

    public Canario(String nombre, int edad, String estado, String fechaNacimiento, String pico,
                   boolean vuela, String color, boolean canta) {
        super(nombre, edad, estado, fechaNacimiento, pico, vuela);
        this.color = color;
        this.canta = canta;
    }

    @Override
    public void muestra() {
        System.out.println("Nombre: " + this.getNombre() +
                "\nEdad: " + this.getEdad() + "\nEstado: " + this.getEstado() +
                "\nColor: " + this.getColor() + "\nFecha de nacimiento: " + this.getFechaNacimiento() +
                "\nCanta: " + this.getCanta());
    }

    public void habla() {
        System.out.println("*habla en canario*");
    }

    void saluda(){System.out.println("holu");}

    void volar() {
        System.out.println("i believe i can fly :D");
    }


    public String getColor() {
        return color;
    }

    public void setColor(String origen) {
        this.color = origen;
    }

    public boolean getCanta() {
        return canta;
    }

    public void setCanta(boolean habla) {
        this.canta = habla;
    }
}
