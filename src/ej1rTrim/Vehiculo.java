package ej1rTrim;

import java.util.Scanner;

public class Vehiculo {
    private String modelo;
    private String marca;
    private String color;
    private float combustible;
    private double potencia;
    private double cilindrada;
    private String matricula;
    private String fechaMatriculacion;
    public static String tipo;

    public Vehiculo(String modelo, String marca, String color, float combustible, double potencia, double cilindrada, String matricula, String fechaMatriculacion) {
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
        this.combustible = combustible;
        this.potencia = potencia;
        this.cilindrada = cilindrada;
        this.matricula = matricula;
        this.fechaMatriculacion = fechaMatriculacion;
    }
    public Vehiculo() {
    }

    public String tiempo(double mes,double anio) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Calcula el tiempo que tiene el coche: ");
        System.out.println("Introducir el año: ");
        double anioPasado = teclado.nextDouble();
        System.out.println("Introducir el mes: ");
        double mesPasado = teclado.nextDouble();

        mes = mes - mesPasado;
        anio = anio - anioPasado;

        return "El vehículo tiene " + anio + " años y " + mes + " meses";
    }

    @Override
    public String toString() {
        return "ej1rTrim.Vehiculo{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", color='" + color + '\'' +
                ", combustible=" + combustible +
                ", potencia=" + potencia +
                ", cilindrada=" + cilindrada +
                ", matricula='" + matricula + '\'' +
                ", fechaMatriculacion='" + fechaMatriculacion + '\'' +
                '}';
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getCombustible() {
        return combustible;
    }

    public void setCombustible(float combustible) {
        this.combustible = combustible;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getFechaMatriculacion() {
        return fechaMatriculacion;
    }

    public void setFechaMatriculacion(String fechaMatriculacion) {
        this.fechaMatriculacion = fechaMatriculacion;
    }

    public static String getTipo() {
        return tipo;
    }


}
