package ej1rTrim;

public class principalEmpleado {
    public static void main(String[] args) {
        Empleado e1 = new Empleado("Agus",(float) 1600.5, (byte) 12,"octubre");

        System.out.println("Mes: " + e1.getMes() +
                "\nNombre del empleado: "  + e1.getNombre() +
                "\nSueldo Base: " + e1.getSueldo() +
                "\nPorcentaje de descuento: " + e1.getDescuento21() +
                "\nHorasExtra: " + e1.getPrecioHorasExtras() +
                "\nDescuentos: " + e1.getDescuento() +
                "\nDiferencia: " + e1.getDiferencia() +
                "\nSueldo neto: " + e1.getSueldoNeto());
    }
}
