package ej1rTrim;

import java.util.Scanner;


public class principalPagoOrdenador {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        pagoOrdenador p1 = new pagoOrdenador();
        System.out.println("Introducir marca del ordenador: ");
        String marca = teclado.nextLine();
        p1.marcaOrdenador = marca;
        System.out.println(p1.menu());
        System.out.println("Introducir la forma de pago: ");
        String pago = teclado.nextLine();

        System.out.println("Introducir el precio inicial del ordenador: ");
        double precio = teclado.nextDouble();

        p1.precioInicial = precio;
        System.out.println("Marca del ordenador:" + p1.marcaOrdenador + "\nPrecio inicial: " + p1.precioInicial
                    +  "\nPrecio final: " + p1.leerFormaDePago(pago) +
                    "\nMensualidad: " + pago);

    }

}
