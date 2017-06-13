package businesslogic.DAOClasses;

import businesslogic.Curso;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import dataaccess.ConexionBD;

/**
 *
 * @author fernandomanuel
 */
public class CursoDAO {
    

    public List<Curso> mostrarCursos() throws SQLException {
        List<Curso> listaCursos = new ArrayList();
        ConexionBD conexionBase = new ConexionBD();
        try {
            conexionBase.conectar();
            PreparedStatement sentencia = conexionBase.conexion.prepareStatement("select * from curso");
            ResultSet resultado = sentencia.executeQuery();
            while (resultado.next()) {
                Curso curso = new Curso();
                curso.setIdCurso(resultado.getString("idCurso"));
                curso.setNombreCurso(resultado.getString("nombre"));
                listaCursos.add(curso);
            }
            conexionBase.cerrarConexion();
        } catch (SQLException e) {
            System.out.println(e);
        }
        return listaCursos;
    }

    public String obtenerIdCurso(String nombreCurso) throws SQLException {
        ResultSet resultado = null;
        ConexionBD conexionBase = new ConexionBD();
        try {
            conexionBase.conectar();
            PreparedStatement sentencia = conexionBase.conexion.prepareStatement("select idCurso from curso where nombre = ?");
            sentencia.setString(1, nombreCurso);
            resultado = sentencia.executeQuery();
            resultado.next();
            conexionBase.cerrarConexion();
        } catch (SQLException e) {
            System.out.println(e);
        }
        return resultado.getString("idCurso");
    }
    
}
