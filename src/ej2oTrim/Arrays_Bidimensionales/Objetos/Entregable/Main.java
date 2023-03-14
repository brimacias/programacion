package ej2oTrim.Arrays_Bidimensionales.Objetos.Entregable;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Alumno[] arrayAlumnos = new Alumno[100];
        int[] arrayNotas = new int[100];
        int nota;
        for (int i = 0; i < /*arrayAlumnos.length*/50; i++) {
            nota = (int)(Math.random()*10);
            arrayAlumnos[i] = new Alumno("alumno" + i, nota);
            for (int j = 0; j < /*arrayNotas.length*/50;j++) {
                nota = arrayNotas[j];
            }
        }

        menu(arrayAlumnos,arrayNotas);
    }

    public static void menu (Alumno[] arrayAlumnos,int[]  arrayNotas){
        Scanner input = new Scanner(System.in);
        System.out.println("Inicialización del Sistema");
        byte op = 0;

        do {
            menuPrincipal();
            op = leerByte(input);
            switch (op) {
                case 1:
                    Nota.verNotas(arrayAlumnos);
                    //Ver notas
                case 2:
                    Nota.anadirNotas(arrayAlumnos);
                    //Añadir notas
                case 3:
                    Nota.borrarNota(arrayAlumnos,arrayNotas);
                    //Borrar nota
                case 4:
                    Nota.estadisticas(arrayNotas);
                    //Estadísticas
                case 5:
                    Nota.verSuspendidos(arrayNotas);
                    //Ver suspendidos
                case 0:
                    fin();
            }
        } while (op != 0);
        //Cierre de la conexión
        input.close();
    }

    public static byte leerByte(Scanner sc) {

        byte valor = 0;
        boolean correcto;

        correcto = true;

        do {
            valor = sc.nextByte();
            if (valor<0||valor>6) {
                System.out.println("ERROR. No ha introducido un valor válido. Introduzca un número: ");
                correcto=false;
            }
            else correcto=true;
        } while (!correcto);

        return valor;
    }

    public static void menuPrincipal() {
        System.out.println("----------------------------------------------\n"
                + "\t\t\tGESTIÓN DE NOTAS DE ALUMNOS\n\n"
                + "1.-Ver notas\n"
                + "2.-Añadir nota\n"
                + "3.-Borra nota\n"
                + "4.-Estadísticas\n"
                + "5.-Ver suspendidos\n"
                + "6.-SALIR");
    }

    public static void fin() {
        System.out.println("PROGRAMA FINALIZADO");
    }
}
