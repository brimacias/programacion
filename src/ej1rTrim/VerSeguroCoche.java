package ej1rTrim;

public class VerSeguroCoche {
    public static String ver(){
        seguroCoche s1 = new seguroCoche("Roque",35,7,17000);
        return "Nombre del asegurado: " + seguroCoche.nombreAsegurado +
                "\nPrecio que deberá abonar por su seguro: " + seguroCoche.getTarifaBase();
    }

    public static void main(String[] args) {
        System.out.println(ver());

    }
}
