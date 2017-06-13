package businesslogic.DAOClasses;
import businesslogic.Alumno;
import dataaccess.ConexionBD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase que verifica que el alumno este registrado en la base de datos para poder realizar o eliminar
 * una reservación de actividad.
 * @author Jesús Enrique Flores Nestozo
 * @version 1.1
 */
public class IngresarMatriculaReservacionDAO{
    
    /**
     * Método que abre una conexión a la base de datos y busca que exista un alumno con una matricula dada.
     * @param usuarioAlumno objeto de tipo alumno de donde se obtiene la matrícula
     * @return true si el alumno se encuentra registrado en la base de datos, false si no se encuentra
     */
    public boolean verificarMatricula(Alumno usuarioAlumno){
        boolean verificado = false;
        ConexionBD conexionMysql = new ConexionBD();
        try {
            conexionMysql.conectar();
            PreparedStatement sentencia = conexionMysql.conexion.prepareStatement("select * from alumno where matricula = ?");
            sentencia.setString(1, usuarioAlumno.getMatricula());
            ResultSet resultado = sentencia.executeQuery();
            if(resultado.next()){
                usuarioAlumno.setNombre(resultado.getString("nombre"));
                usuarioAlumno.setApellidoPaterno(resultado.getString("apellidoPaterno"));
                usuarioAlumno.setApellidoMaterno(resultado.getString("apellidoMaterno"));
                usuarioAlumno.setCorreo(resultado.getString("correo"));
                usuarioAlumno.setTelefono(resultado.getString("telefono"));
                verificado = true;
            }
            conexionMysql.cerrarConexion();
        } catch (SQLException ex) {
            Logger.getLogger(IngresarMatriculaReservacionDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return verificado;
    }
}
