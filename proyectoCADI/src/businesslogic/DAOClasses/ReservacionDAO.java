package businesslogic.DAOClasses;
import businesslogic.Actividad;
import businesslogic.Alumno;
import java.util.List;
import businesslogic.Reservacion;
import dataaccess.ConexionBD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Clase que realiza una conexión a la base de datos y lleva a cabo las operaciones para la reservación
 * @author Jesús Enrique Flores Nestozo
 * @version 1.3
 */
public class ReservacionDAO{
    
    /**
     * Método que crea una reservación para un alumno en específico con sus respectivos datos.
     * @param alumno el objeto alumno al cual se le va a realizar una reservación.
     * @param actividad el objeto de tipo actividad al cual el alumno quiere realizar una reservación
     * @return true si se logró crear la reservación, false si no se pudo realizar.
     */
    public boolean crearReservacion(Alumno alumno,Actividad actividad){
        boolean reservacionCreada = false;
        ConexionBD conexionMysql = new ConexionBD();
        try {
            conexionMysql.conectar();
            if(actividad.getCupo() > 0){
                java.util.Date fecha = new java.util.Date();
                java.text.SimpleDateFormat formato = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String tiempoActual = formato.format(fecha);
                PreparedStatement sentencia = conexionMysql.conexion.prepareStatement("insert into reservacion values(?,?,?,?)");
                sentencia.setString(1, null);
                sentencia.setString(2, tiempoActual);
                sentencia.setString(3, alumno.getMatricula());
                sentencia.setString(4, actividad.getIdActividad());
                if(sentencia.executeUpdate() == 1){
                    reservacionCreada = true;
                    actividad.setCupo(actividad.getCupo()-1);
                    ActividadDAO actividadModificada = new ActividadDAO();
                    actividadModificada.actualizarCupoDeActividad(actividad);
                }
            }
        } catch (SQLException e) {
            System.out.println("Error al conectar a la base de datos, no se pudo hacer la reservacion" + e.getMessage());
        }
        return reservacionCreada;
    }
    
    /**
     * Método que ingresa a la base de datos y obtiene las reservaciones que tiene un alumno.
     * @param alumno el objeto de tipo Alumno del cual se quiere obtener las reservaciones que tiene.
     * @return lista de objetos de tipo reservacion del alumno
     */
    public List<Reservacion> mostrarReservaciones(Alumno alumno){
        List<Reservacion> listaDeReservacion = new ArrayList();
        ConexionBD conexionMysql = new ConexionBD();
        try {
            conexionMysql.conectar();
            PreparedStatement sentencia = conexionMysql.conexion.prepareStatement("select reservacion.idReservacion, reservacion.fechaReservacion, actividad.nombre"
                    + " from reservacion, actividad where reservacion.matricula = ? AND reservacion.idActividad = actividad.idActividad");
            sentencia.setString(1, alumno.getMatricula());
            ResultSet resultado = sentencia.executeQuery();
            listaDeReservacion = crearListaDeReservaciones(resultado);
            conexionMysql.cerrarConexion();
        } catch (SQLException e) {
            System.out.println("Error al conectar a la base de datos" + e.getMessage());
        }
        
        return listaDeReservacion;
    }
    
    /**
     * Método que crea la lista de las reservaciones que tiene el alumno actualmente.
     * @param resultado un objeto de tipo ResultSet el cual contiene el resultado de la ejecución de la sentencia
     * en la base de datos.
     * @return lista de objetos de tipo Reservacion
     */
    public List<Reservacion> crearListaDeReservaciones(ResultSet resultado){
        List<Reservacion> listaCreada = new ArrayList();
        try {
            while(resultado.next()){
                Reservacion reservacion = new Reservacion();
                reservacion.setIdReservacion(resultado.getString("idReservacion"));
                reservacion.setFechaReservacion(resultado.getString("fechaReservacion"));
                reservacion.setActividad(resultado.getString("nombre"));
                listaCreada.add(reservacion);
            }
        } catch (Exception e) {
            System.out.println("No se pudo crear la lista " + e.getMessage());
        }
        return listaCreada;
    }
    
    /**
     * Método que ingresa a la base de datos y busca si la reservación que el alumno quiere realizar ya existe
     * @param alumno objeto de tipo Alumno del cual se quiere buscar la reservación
     * @param actividad objeto de tipo Actividad de la cual se quiere saber si existe una reservación.
     * @return true si ya existe una reservacion para una actividad para un alumno, false si el alumno no cuenta con
     * reservación para dicha actividad.
     */
    public boolean buscarReservacion(Alumno alumno, Actividad actividad){
        boolean yaReservada = false;
        ConexionBD conexionMysql = new ConexionBD();
        try {
            conexionMysql.conectar();
            PreparedStatement sentencia = conexionMysql.conexion.prepareStatement("select * from reservacion where matricula = ? AND idActividad = ?");
            sentencia.setString(1, alumno.getMatricula());
            sentencia.setString(2, actividad.getIdActividad());
            ResultSet resultado = sentencia.executeQuery();
            if(resultado.next()){
                yaReservada = true;
            }
            conexionMysql.cerrarConexion();
            
        } catch (SQLException e) {
            System.out.println("Error al conectar a la base de datos" + e.getMessage());
        }
        return yaReservada;
    }
    
    /**
     * Método que abre una conexión a la base de datos y elimina una reservación de un alumno-
     * @param reservacion objeto de tipo Reservacion, la cual quiere ser eliminada
     * @return true si se logró eliminar la actividad, false si no se pudo eliminar
     */
    public boolean eliminarReservacion(Reservacion reservacion){
        boolean reservacionEliminada = false;
        ConexionBD conexionMysql = new ConexionBD();
        ActividadDAO actividadDao = new ActividadDAO();
        try {
            conexionMysql.conectar();
            Actividad actividad = new Actividad();
            actividad.setIdActividad(actividadDao.obtenerIdActividad(reservacion.getActividad()));
            PreparedStatement sentencia = conexionMysql.conexion.prepareStatement("delete from reservacion where idReservacion =?");
            sentencia.setString(1, reservacion.getIdReservacion());
            if(sentencia.executeUpdate() == 1){
                reservacionEliminada = true;
                actividadDao.actualizarCupoDeActividad(actividad);
            }
            conexionMysql.cerrarConexion();
        } catch (SQLException e) {
            System.out.println("Error al eliminar la reservacion" + e.getMessage());
        }
        
        return reservacionEliminada;
    }
}
