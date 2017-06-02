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
public class Reservacion {
    private String idReservacion = "";
    private String fechaReservacion = "";
    private String diaReservacion = "";
    private String mesReservacion = "";
    private String anioReservacion = "";

    public String getIdReservacion() {
        return idReservacion;
    }

    public void setIdReservacion(String idReservacion) {
        this.idReservacion = idReservacion;
    }

    public String getFechaReservacion() {
        return fechaReservacion;
    }

    public void setFechaReservacion(String fechaReservacion) {
        this.fechaReservacion = fechaReservacion;
    }

    public String getDiaReservacion() {
        return diaReservacion;
    }

    public void setDiaReservacion(String diaReservacion) {
        this.diaReservacion = diaReservacion;
    }

    public String getMesReservacion() {
        return mesReservacion;
    }

    public void setMesReservacion(String mesReservacion) {
        this.mesReservacion = mesReservacion;
    }

    public String getAnioReservacion() {
        return anioReservacion;
    }

    public void setAnioReservacion(String anioReservacion) {
        this.anioReservacion = anioReservacion;
    }
    
}
