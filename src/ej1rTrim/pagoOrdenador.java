package ej1rTrim;

public class pagoOrdenador {
    public static String marcaOrdenador;
    public static double precioInicial;
    public static String pago;
    public static String formaPago;
    public static double precioFinal;

    public pagoOrdenador() {
        this.marcaOrdenador = marcaOrdenador;
        this.precioInicial = precioInicial;
    }

    public static String menu() {
        return "Escoger una de las tres formas de pago:" +
                "\n1. Al contado." +
                "\n2. En 6 meses." +
                "\n3. En 12 meses.";
    }

    public static double leerFormaDePago(String cadena) {
        int mensualidad;
        switch (cadena) {
            case "Al contado":
                formaPago = "Al contado";
                precioFinal = precioInicial;
                break;
            case "En 6 meses":
                formaPago = "En 6 meses";
                mensualidad = 6;
                precioFinal = precioInicial + (precioInicial*0.08);
                break;
            case "En 12 meses":
                formaPago = "En 12 meses";
                mensualidad = 12;
                precioFinal = precioInicial + (precioInicial*0.15);
        }
        return precioFinal;
    }

}
