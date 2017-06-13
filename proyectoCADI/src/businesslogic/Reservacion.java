package businesslogic;

/**
 * Clase que crea el objeto Reservación con sus respectivos atributos.
 * @author Jesús Enrique Flores Nestozo
 * @version 1.1
 */
public class Reservacion {
    private String idReservacion = "";
    private String fechaReservacion = "";
    private String Actividad = "";

    public String getActividad() {
        return Actividad;
    }

    public void setActividad(String Actividad) {
        this.Actividad = Actividad;
    }
    

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
    
}
