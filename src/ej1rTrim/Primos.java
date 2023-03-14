package ej1rTrim;

import java.util.Scanner;

public class Primos {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un número positivo: ");
        int numero = teclado.nextInt();

        if (esPrimoInt(numero) == 1) {
            System.out.println("El número " + numero + " SÍ es primo.");
        } else {
            System.out.println("El número " + numero + " NO es primo.");
        }
        if (esPrimoInt(numero) == 1) {
            System.out.println("El número " + numero + " SÍ es primo.");
        } else {
            System.out.println("El número " + numero + " NO es primo.");
        }
        ejercicioPrimoBucle();
    }

     static boolean esPrimo(int numero) {
        boolean primo = true;
        int c=numero-1;
         while(primo && c>1){ // for(int c=numero-1;primo && c>1;c--)
             if (numero%c==0) {
                 primo=false;
             }
             c--;
         }
        return primo;
    }

    public static int esPrimoInt(int numero){
        int primo = 1;
        int c = numero -1;
        while (primo==1 && c>1) {
            if (numero%c==0) {
                primo = 0;
            }
            c--;
        }
        return primo;
    }

    public static void ejercicioPrimoBucle() {
        //Que pida un número y diga si es primo o no.
        Scanner leer = new Scanner(System.in);

        int num, contador = 2;
        boolean primo = true;

        System.out.println("Ingrese el número: ");
        num = leer.nextInt();

        while (primo & contador < num) {//for(int contador = 2; primo && c < numero;contador+)
            if (num % contador == 0) {
                primo = false;
            } else {
                contador++;
            }
            if (primo) {
                System.out.println("El número " + num + " SÍ es primo.");
            } else {
                System.out.println("El número " + num + " NO es primo.");
            }
        }
    }
    public static void contarPrimos() {
        int numero;
        int contPrimos = 0;
        Scanner leer = new Scanner(System.in);
        /**
         * llamadas a los métodos para validar los números como positivos:
         *  esPositivo(leer);
         *  numero = esPositivoReturn(leer);
         */

        System.out.println("Introduzca un número: ");
        numero = leer.nextInt();

        for (int i =numero; i>0;i--) {
            if(esPrimo(i)) {
                System.out.println(i + " es primo.");
                contPrimos++;
            }
        }
        System.out.println("Hay " + contPrimos + " números primos.");
    }

    public static void esPositivo(Scanner leer) {
        int numero;
        do {
            System.out.println("Introduzca un número positivo: ");
            numero = leer.nextInt();
            if (numero < 0) {
                System.out.println("No puede ser negativo.");
            }
        } while (numero < 0);
    }

    public static int esPositivoReturn(Scanner leer) {
        int numero;
        do {
            System.out.println("Introduzca un número positivo: ");
            numero = leer.nextInt();
            if (numero < 0) {
                System.out.println("No puede ser negativo.");
            }
        } while (numero < 0);
        return numero;
    }
}
