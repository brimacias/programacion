package ej1rTrim;

public class OlaCurso {
    public static void main(String[] args) {
        System.out.println("Ola Curso!!");

        String cadena;
        cadena = "esto es una cadena";
        String subcadena = cadena.substring(0,4);

        System.out.println("cadena: " + cadena);
        System.out.println("subcadena: " + subcadena);

        int a = 10;
        int b = 40;
        System.out.println("a: " + a);
        System.out.println("b: " + b);

        int i = 100;
        long l = (long)i;
        System.out.println("l: " + l);
    }
}
