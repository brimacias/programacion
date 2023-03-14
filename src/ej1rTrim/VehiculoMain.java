package ej1rTrim;

import java.util.Scanner;

public class VehiculoMain {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Vehiculo.tipo= "Coche";

        //ej1rTrim.Vehiculo con constructor parametrizado
        System.out.println("----------COCHE 1----------");
        //Introducir los datos por teclado
        System.out.println("Introducir el modelo del coche: ");
        String modelo = teclado.nextLine();
        System.out.println("Introducir la marca: ");
        String marca = teclado.nextLine();
        System.out.println("Introducir el color: ");
        String color = teclado.nextLine();
        System.out.println("Introducir el combustible (en litros): ");
        float combustible = teclado.nextFloat();
        System.out.println("Introducir la potencia: ");
        double potencia = teclado.nextDouble();
        System.out.println("Introducir la cilindrada: ");
        double cilindrada = teclado.nextDouble();
        teclado.nextLine();
        System.out.println("Introducir la matrícula del vehículo: ");
        String matricula = teclado.nextLine();
        System.out.println("Introducir la fecha de matriculación: ");
        String fechaMatriculacion = teclado.nextLine();
        //Creación de una instancia y pasarle los datos que antes hemos leído por teclado
        Vehiculo coche1 = new Vehiculo();
        coche1.setModelo(modelo);
        coche1.setMarca(marca);
        coche1.setColor(color);
        coche1.setCombustible(combustible);
        coche1.setPotencia(potencia);
        coche1.setCilindrada(cilindrada);
        coche1.setMatricula(matricula);
        coche1.setFechaMatriculacion(fechaMatriculacion);
        System.out.println(coche1.toString());
        System.out.println(coche1.tiempo(10,2020));

        //ej1rTrim.Vehiculo con constructor vacío y asignación de los atributos por teclado
        System.out.println("----------COCHE 2----------");
        Vehiculo coche2 = new Vehiculo();
        System.out.println("Introducir el modelo del coche: ");
        coche2.setModelo(teclado.nextLine());
        System.out.println("Introducir la marca: ");
        coche2.setMarca(teclado.nextLine());
        System.out.println("Introducir el color: ");
        coche2.setColor(teclado.nextLine());
        System.out.println("Introducir el combustible (en litros): ");
        coche2.setCombustible(teclado.nextFloat());
        System.out.println("Introducir la potencia: ");
        coche2.setPotencia(teclado.nextDouble());
        System.out.println("Introducir la cilindrada: ");
        coche2.setCilindrada(teclado.nextFloat());
        teclado.nextLine();
        System.out.println("Introducir la matrícula del vehículo: ");
        coche2.setMatricula(teclado.nextLine());
        System.out.println("Introducir la fecha de matriculación (mm/aaaa): ");
        coche2.setFechaMatriculacion(teclado.nextLine());
        System.out.println(coche2.toString());
        System.out.println(coche2.tiempo(8,2019));

        //Vehículo con los atributos introducidos directamente en el constructor
        Vehiculo coche3 = new Vehiculo("Modelo", "Marca","Gris",40,80,1500,"MATRICULA","10/2021");
        System.out.println("Coche 3:\n" + coche3.toString());
        System.out.println(coche3.tiempo(5,2015));
    }
}
