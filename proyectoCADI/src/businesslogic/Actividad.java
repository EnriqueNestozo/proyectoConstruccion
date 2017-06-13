
package businesslogic;
<<<<<<< HEAD

import java.util.List;

=======
>>>>>>> 7998acc809af373cb1357cb266b68ec731fb77c7
/**
 *Esta clase crea el objeto actividad la cual contiene los datos de las actividades con sus respectivos getters y setters
 * @author Enrique
 * @version 1.0
 */
public class Actividad {
    private String idActividad = "";
    private String nombreActividad = "";
    private String descripcion = "";
    private int cupo = 0;
    private String horaInicio = "";
    private String horaFin = "";
    private String fechaActividad = "";
    private String area = "";
    private String idCurso = "";

    public Actividad(String idActividad,String nombreActividad,String descripcion,int cupo,String horaInicio,String horaFin,String fechaActividad,String area) {
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

    public int getCupo() {
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

    public void setCupo(int cupo) {
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

    public List<Actividad> mostrarActividadIdioma(String obtenerIdCurso) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}
