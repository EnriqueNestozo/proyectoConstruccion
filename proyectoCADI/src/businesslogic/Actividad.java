
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
    private String fechaActividad = "";
    private String area = "";
    private String idCurso = "";

    public Actividad(String idActividad,String nombreActividad,String descripcion,String cupo,String horaInicio,String horaFin,String fechaActividad,String area) {
        this.idActividad = idActividad;
        this.nombreActividad = nombreActividad;
         this.descripcion = descripcion;
        this.cupo = cupo;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.fechaActividad = fechaActividad;
        this.area = area;
        this.idCurso = idCurso;
    }

    public String getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(String idCurso) {
        this.idCurso = idCurso;
    }
    
    public Actividad(){
        
    }
    
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

    public String getFechaActividad() {
        return fechaActividad;
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

    public void setFechaActividad(String fechaActividad) {
        this.fechaActividad = fechaActividad;
    }

    public void setArea(String area) {
        this.area = area;
    }

   
}
