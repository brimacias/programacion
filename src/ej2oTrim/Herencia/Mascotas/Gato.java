package ej2oTrim.Herencia.Mascotas;

public class Gato extends Mascotas{
    private String color;
    private boolean peloLargo;

    public Gato(String nombre, int edad, String estado, String fechaNacimiento, String color, boolean peloLargo) {
        super(nombre, edad, estado, fechaNacimiento);
        this.color = color;
        this.peloLargo = peloLargo;
    }

    @Override
    public void muestra() {
        System.out.println("Nombre: " + this.getNombre() +
                "\nEdad: " + this.getEdad() + "\nEstado: " + this.getEstado() +
                "\nFecha de nacimiento: " + this.getFechaNacimiento() +
                "\nColor: " + this.getColor() + "\nPelo largo: " + this.getPeloLargo());
    }

    @Override
    public void habla() {
        System.out.println("marramamiau");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean getPeloLargo() {
        return peloLargo;
    }

    public void setPeloLargo(boolean peloLargo) {
        this.peloLargo = peloLargo;
    }
}
