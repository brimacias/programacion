package ej2oTrim.Arrays_Bidimensionales.Objetos.Concesionario;

class Coche {
    String marca;
    String modelo;
    double precioBase;
    boolean aireAcondicionado = true;
    String cierreCentral;
    String pinturaMetalizada = "pintura";
    String tipoMotor = "motor de coche :v";

    public Coche(String marca, String modelo, double precioBase, boolean aireAcondicionado, String cierreCentral,
                 String pinturaMetalizada, String tipoMotor) {
        this.marca = marca;
        this.modelo = modelo;
        this.precioBase = precioBase;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", precioBase=" + precioBase +
                ", aireAcondicionado=" + aireAcondicionado +
                ", cierreCentral='" + cierreCentral + '\'' +
                ", pinturaMetalizada='" + pinturaMetalizada + '\'' +
                ", tipoMotor='" + tipoMotor + '\'' +
                '}';
    }
}
