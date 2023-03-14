package ej2oTrim.Herencia.Mascotas;

public abstract class Aves extends Mascotas{
    private String pico;
    private boolean vuela;

    public Aves(String nombre, int edad, String estado, String fechaNacimiento, String pico, boolean vuela) {
        super(nombre, edad, estado, fechaNacimiento);
        this.pico = pico;
        this.vuela = vuela;
    }

    public abstract void muestra();

    public abstract void habla();

    abstract void volar();

    public String getPico() {
        return pico;
    }

    public void setPico(String pico) {
        this.pico = pico;
    }

    public boolean getVuela() {
        return vuela;
    }

    public void setVuela(boolean vuela) {
        this.vuela = vuela;
    }
}
