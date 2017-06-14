/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic.DAOClasses;

import businesslogic.Curso;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import dataaccess.ConexionBD;

/**
 *Clase que realiza las acciones para la clase Curso.
 * Recibe los parámetros de la gui y en base a ellos abre la conexión a la base de datos y realiza las operaciones.
 * @author fernandomanuel
 */
public class CursoDAO {
    
    /**
     * Metodo que genera una lista de los cursos disponibles
     * @return lista de cursos
     * @throws SQLException 
     * @version 1.2
     */
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
    /**
     * Metodo que recibe un nombre de curso para obtener su ID
     * @param nombreCurso
     * @return el id del curso seleccionado
     * @throws SQLException 
     */
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
