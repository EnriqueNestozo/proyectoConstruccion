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
            System.out.println("No se pudo hacer la reservacion" + e.getMessage());
        }
        return reservacionCreada;
    }
    
    public void eliminar(Reservacion reservacion){
        
    }
    
    public List<Reservacion> mostrar(){
        List<Reservacion> listaDeReservacion = new ArrayList();
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
            
        } catch (Exception e) {
        }
        return yaReservada;
    }
}
