package ej2oTrim.Herencia.Mascotas;

import java.time.LocalDateTime;

public class HistorialRevision {
    private boolean repetida;
    private LocalDateTime fecha;
    private boolean vacuna;
    private String comentario;

    public HistorialRevision(boolean repetida, LocalDateTime fecha, boolean vacuna, String comentario) {
        this.repetida = repetida;
        this.fecha = fecha;
        this.vacuna = vacuna;
        this.comentario = comentario;
    }

    public boolean isRepetida(){return repetida;}

    public void setRepetida(boolean repetida) {
        this.repetida = repetida;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "HistorialRevision{" +
                "repetida=" + repetida +
                ", fecha=" + fecha +
                ", vacuna=" + vacuna +
                ", comentario='" + comentario + '\'' +
                '}';
    }
}
