package ej1rTrim;

public class seguroCoche {
    private static double tarifaBase;
    public static String nombreAsegurado;
    public static int edad;
    public static int aniosCarnet;
    public static double precioCoche;

    public seguroCoche(String nombreAsegurado,int edad, int aniosCarnet,double precioCoche) {
        this.nombreAsegurado = nombreAsegurado;
        this.edad = edad;
        this.aniosCarnet = aniosCarnet;
        this.precioCoche = precioCoche;
        this.tarifaBase = 300;
    }

    public void seguro(){
        System.out.println("Nombre del asegurado: " + nombreAsegurado + "\nEdad: " + edad +
                "\nAñosCarnet: " + aniosCarnet + "\nPrecioCoche: " + precioCoche);
    }
    public static void setTarifaBase(double tarifaBase) {
        if (edad < 28 || aniosCarnet < 5) {
            tarifaBase = tarifaBase + 100;
        } else if (precioCoche > 15000) {
                tarifaBase = tarifaBase + (tarifaBase*0.12);
        } else {
            tarifaBase = tarifaBase;
        }
    }

    public static double getTarifaBase() {
        return tarifaBase;
    }


}
