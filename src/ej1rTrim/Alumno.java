package ej1rTrim;

public class Alumno {
    public String nombre;
    public String dni;
    private String nivelAcademico;

    public Alumno(){

    }

    public Alumno(String nombre, String dni, String nivelAcademico) {
        this.nombre = nombre;
        this.dni = dni;
        this.nivelAcademico = "nivelPorDefecto";
    }

    public void resolverExamen(String enunciado) {
        System.out.println("Está resolviendo el siguiente examen: " + enunciado);
    }

    public void matricularse(String modulo) {
        System.out.println("Matriculándose en el siguiente módulo: " + modulo);
    }

    public String getNivelAcademico() {
        return nivelAcademico;
    }
}
