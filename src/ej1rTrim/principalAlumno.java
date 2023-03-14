package ej1rTrim;

public class principalAlumno{
    public static void main(String[] args) {

        Alumno alumno1;
        alumno1 = new Alumno();

        alumno1.getNivelAcademico();
        String a = alumno1.getNivelAcademico();
        System.out.println("Nivel académico: " + a);
        alumno1.resolverExamen("suspendiste boludo");

        Alumno alumno2 = new Alumno("nombre", "dni", null);
        System.out.println(alumno2.getNivelAcademico());


    }
}