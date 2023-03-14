package ej1rTrim;

public class Toxicidad {
    private static String nombreProducto;
    private static int gradoToxicidad;

    public Toxicidad(String nombreProducto, int gradoToxicidad) {
        this.nombreProducto = nombreProducto;
        this.gradoToxicidad = gradoToxicidad;
    }

    public static String getNombreProducto() {
        return nombreProducto;
    }
    public static void setGradoToxicidad() {
        if (gradoToxicidad >= 0 && gradoToxicidad <= 10) {
            System.out.println("No toxico.");
        } else if (gradoToxicidad == 11) {
            System.out.println("Baja toxicidad.");
        } else if (gradoToxicidad == 12) {
            System.out.println("Media toxicidad.");
        } else if (gradoToxicidad == 13) {
            System.out.println("Alta toxicidad.");
        } else if (gradoToxicidad > 13) {
            System.out.println("Altamente peligroso.");
        } else {
            System.out.println("Error en toxicidad.");
        }
    }
    public static int getGradoToxicidad() {
        return gradoToxicidad;
    }

}
