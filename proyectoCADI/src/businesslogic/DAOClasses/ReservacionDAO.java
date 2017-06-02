package businesslogic.DAOClasses;
import java.util.List;
import businesslogic.Reservacion;
import dataaccess.ConexionBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Enrique
 */
public class ReservacionDAO extends ConexionBD {
    public void crear(){
        try {
            this.Conectar();
            PreparedStatement estado = this.conexion.prepareStatement("insert into reservacion values(?,?,?,?,?");
            estado.setString(1, null);
            
        } catch (SQLException e) {
        }
        
    }
    public void eliminar(Reservacion reservacion){
        
    }
    public List<Reservacion> mostrar(){
        List<Reservacion> listaDeReservacion = new ArrayList();
        return listaDeReservacion;
    }
}
