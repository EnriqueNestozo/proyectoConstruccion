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
 *
 * @author Enrique
 */
public class ReservacionDAO extends ConexionBD {
    
    public boolean crear(Alumno alumno,Actividad actividad){
        boolean reservacionCreada = false;
        try {
            this.conectar();
            java.util.Date fecha = new java.util.Date();
            java.text.SimpleDateFormat formato = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String tiempoActual = formato.format(fecha);
            PreparedStatement sentencia = this.conexion.prepareStatement("insert into reservacion values(?,?,?,?)");
            sentencia.setString(1, null);
            sentencia.setString(2, tiempoActual);
            sentencia.setString(3, alumno.getMatricula());
            sentencia.setString(4, actividad.getIdActividad());
            if(sentencia.executeUpdate() == 1){
                reservacionCreada = true;
            }
            
        } catch (SQLException e) {
            System.out.println("Error al conectar a la base de datos, no se pudo hacer la reservacion" + e.getMessage());
        }
        return reservacionCreada;
    }
    
    public List<Reservacion> mostrar(Alumno alumno){
        List<Reservacion> listaDeReservacion = new ArrayList();
        try {
            this.conectar();
            PreparedStatement sentencia = this.conexion.prepareStatement("select reservacion.idReservacion, reservacion.fechaReservacion, actividad.nombre"
                    + " from reservacion, actividad where reservacion.matricula = ? AND reservacion.idActividad = actividad.idActividad");
            sentencia.setString(1, alumno.getMatricula());
            ResultSet resultado = sentencia.executeQuery();
            while(resultado.next()){
                Reservacion reservacion = new Reservacion();
                reservacion.setIdReservacion(resultado.getString("idReservacion"));
                reservacion.setFechaReservacion(resultado.getString("fechaReservacion"));
                reservacion.setActividad(resultado.getString("nombre"));
                listaDeReservacion.add(reservacion);
            }
            this.cerrarConexion();
        } catch (SQLException e) {
            System.out.println("Error al conectar a la base de datos" + e.getMessage());
        }
        
        return listaDeReservacion;
    }
    
    public boolean buscarReservacion(Alumno alumno, Actividad actividad){
        boolean yaReservada = false;
        try {
            this.conectar();
            PreparedStatement sentencia = this.conexion.prepareStatement("select * from reservacion where matricula = ? AND idActividad = ?");
            sentencia.setString(1, alumno.getMatricula());
            sentencia.setString(2, actividad.getIdActividad());
            ResultSet resultado = sentencia.executeQuery();
            if(resultado.next()){
                yaReservada = true;
            }
            this.cerrarConexion();
            
        } catch (SQLException e) {
            System.out.println("Error al conectar a la base de datos" + e.getMessage());
        }
        return yaReservada;
    }
    
    public boolean eliminarReservacion(Reservacion reservacion){
        boolean reservacionEliminada = false;
        try {
            this.conectar();
            PreparedStatement sentencia = this.conexion.prepareStatement("delete from reservacion where idReservacion =?");
            sentencia.setString(1, reservacion.getIdReservacion());
            if(sentencia.executeUpdate() == 1){
                reservacionEliminada = true;
            }
            this.cerrarConexion();
        } catch (SQLException e) {
            System.out.println("Error al eliminar la reservacion" + e.getMessage());
        }
        
        return reservacionEliminada;
    }
}
