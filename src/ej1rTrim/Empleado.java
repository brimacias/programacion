package ej1rTrim;

public class Empleado {
    private String nombre;
    private float sueldo;
    private float descuento;
    private byte numHoras;
    private float precioHora;
    private String mes;
    private int porcentaje;

    private float diferencia;
    public Empleado(String nombre, float sueldo, byte numHorasExtras, String mes) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.numHoras = numHoras;
        this.mes = mes;
    }

    public String getNombre() {
        return nombre;
    }

    public float getSueldo() {
        return sueldo;
    }
    public float getDescuento21(){
        return 21;
    }

    public float getDescuento(){
        return porcentaje*(sueldo+numHoras/100);
    }

    public byte getNumHorasExtras() {
        return numHoras;
    }

    public float getPrecioHora() {
        return precioHora;
    }

    public float getPrecioHorasExtras(){
        return numHoras*precioHora;
    }

    public String getMes() {
        return mes;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public float getDiferencia() {
        return sueldo-descuento;
    }

    public float getSueldoNeto(){
        return diferencia+numHoras;
    }
}
