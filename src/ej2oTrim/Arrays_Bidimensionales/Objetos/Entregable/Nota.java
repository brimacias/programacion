package ej2oTrim.Arrays_Bidimensionales.Objetos.Entregable;

import java.util.Arrays;
import java.util.Scanner;

public class Nota {

    public static void verNotas(Alumno[] arrayAlumnos) {
        for (int i = 0 ; i < arrayAlumnos.length;i++) {
            System.out.print(("Nota " + i + ":")+("nombre"+i)+(int)(Math.random()*10));
        }
    }

    public static void anadirNotas(Alumno[] arrayAlumnos) {
        int contador = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introducir el nombre del alumno: ");
        String nombre = teclado.nextLine();
        System.out.println("Introducir la nota del alumno: ");
        int nota = teclado.nextInt();
        contador++;
        arrayAlumnos[50 + contador] = new Alumno(nombre, nota);
    }

    public static void borrarNota(Alumno[] arrayAlumnos, int[] arrayNotas) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introducir el nombre del alumno: ");
        String nombre = teclado.nextLine();

        int resultado = Arrays.binarySearch(arrayAlumnos,arrayNotas);

    }

    public static void estadisticas(int[] arrayNotas) {
        int suma = 0;
        int media = 0;
        int sumaA = 0;
        int mediaA = 0;

        for (int j = 0; j < arrayNotas.length;j++) {
            suma = suma + arrayNotas[j];
            if (arrayNotas[j] >= 5) {
                sumaA = sumaA + arrayNotas[j];
            }
        }
        media = suma / arrayNotas.length;
        mediaA = sumaA / arrayNotas.length;

        System.out.println("La media de todas las notas es " + media);
        System.out.println("La media de las notas de los alumnos aprobados es " + mediaA);
    }

    public static void verSuspendidos(int[] arrayNotas) {
        for (int arrayNota : arrayNotas) {
            if (arrayNota < 5) {
                System.out.println("Lista de alumnos suspendidos: ");
                System.out.print(arrayNota);
            }
        }
    }
}
