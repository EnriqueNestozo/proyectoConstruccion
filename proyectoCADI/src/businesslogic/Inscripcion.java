/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic;

/**
 *
 * @author Enrique
 */
public class Inscripcion {
    private String idInscripcion = "";
    private String periodoInscripcion = "";
    private String anio = "";

    public String getIdInscripcion() {
        return idInscripcion;
    }

    public void setIdInscripcion(String idInscripcion) {
        this.idInscripcion = idInscripcion;
    }

    public String getPeriodoInscripcion() {
        return periodoInscripcion;
    }

    public void setPeriodoInscripcion(String periodoInscripcion) {
        this.periodoInscripcion = periodoInscripcion;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getCalificacionFinal() {
        return calificacionFinal;
    }

    public void setCalificacionFinal(String calificacionFinal) {
        this.calificacionFinal = calificacionFinal;
    }

    public String getEstadoInscripcion() {
        return estadoInscripcion;
    }

    public void setEstadoInscripcion(String estadoInscripcion) {
        this.estadoInscripcion = estadoInscripcion;
    }
    private String calificacionFinal = "";
    private String estadoInscripcion = "";
}
