
package businesslogic;

/**
 *
 * @author Enrique
 */
public class Actividad {
    private String idActividad = "";
    private String nombreActividad = "";
    private String descripcion = "";
    private String cupo = "";
    private String horaInicio = "";
    private String horaFin = "";
    private String fechaCompleta = "";
    private String dia = "";
    private String mes = "";

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }
    private String area = "";

    public String getIdActividad() {
        return idActividad;
    }

    public String getNombreActividad() {
        return nombreActividad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getCupo() {
        return cupo;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public String getHoraFin() {
        return horaFin;
    }

    public String getFechaCompleta() {
        return fechaCompleta;
    }

    public String getArea() {
        return area;
    }

    public void setIdActividad(String idActividad) {
        this.idActividad = idActividad;
    }

    public void setNombreActividad(String nombreActividad) {
        this.nombreActividad = nombreActividad;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setCupo(String cupo) {
        this.cupo = cupo;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public void setHoraFin(String horaFin) {
        this.horaFin = horaFin;
    }

    public void setFechaCompleta(String fecha) {
        this.fechaCompleta = fecha;
    }

    public void setArea(String area) {
        this.area = area;
    }
}
