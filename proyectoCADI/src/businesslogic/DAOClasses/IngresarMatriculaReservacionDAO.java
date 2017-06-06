/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic.DAOClasses;
import businesslogic.Alumno;
import dataaccess.ConexionBD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Enrique
 */
public class IngresarMatriculaReservacionDAO extends ConexionBD {

    public boolean verificarMatricula(Alumno usuarioAlumno){
        boolean verificado = false;
        try {
            this.conectar();
            PreparedStatement sentencia = this.conexion.prepareStatement("select * from alumno where matricula = ?");
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
        } catch (SQLException ex) {
            Logger.getLogger(IngresarMatriculaReservacionDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return verificado;
    }
}
