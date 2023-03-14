package ej1rTrim;

public class principalToxicidad {
    public static void main(String[] args) {
        Toxicidad t1 = new Toxicidad("Producto toxico",5);
        System.out.println("La toxicidad del producto " + Toxicidad.getNombreProducto()
                + " es " + Toxicidad.getGradoToxicidad() + ".");
    }
}
