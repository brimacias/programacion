package ej2oTrim.Herencia.Mascotas;

public class Loro extends Aves {
    private String origen;
    private boolean habla;

    public Loro(String nombre, int edad, String estado, String fechaNacimiento, String pico, boolean vuela,
                String origen, boolean habla) {
        super(nombre, edad, estado, fechaNacimiento, pico, vuela);
        this.origen = origen;
        this.habla = habla;
    }

    @Override
    public void muestra() {
        System.out.println("Nombre: " + this.getNombre() +
                "\nEdad: " + this.getEdad() + "\nEstado: " + this.getEstado() +
                "\nFecha de nacimiento: " + this.getFechaNacimiento() +
                "\nPico: " + this.getPico() + "\nVuela: " + this.getVuela() +
                "\nOrigen: " + this.getOrigen() + "\nHabla: " + this.getHabla());
    }

    public void habla() {
        System.out.println("*habla en loro*");
    }

    public void saluda() {
        System.out.println("holu");
    }

    public void volar() {
        System.out.println("i believe i can fly :D");
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public boolean getHabla() {
        return habla;
    }

    public void setHabla(boolean habla) {
        this.habla = habla;
    }
}
