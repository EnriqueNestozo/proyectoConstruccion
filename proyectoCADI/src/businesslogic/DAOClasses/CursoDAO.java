<<<<<<< HEAD
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
=======
>>>>>>> 7998acc809af373cb1357cb266b68ec731fb77c7
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
<<<<<<< HEAD
            PreparedStatement sentencia = conexion.prepareStatement("select * from curso");
=======
            PreparedStatement sentencia = conexionBase.conexion.prepareStatement("select * from curso");
>>>>>>> 7998acc809af373cb1357cb266b68ec731fb77c7
            ResultSet resultado = sentencia.executeQuery();
            while (resultado.next()) {
                Curso curso = new Curso();
                curso.setIdCurso(resultado.getString("idCurso"));
                curso.setNombreCurso(resultado.getString("nombre"));
                listaCursos.add(curso);
            }
<<<<<<< HEAD
=======
            conexionBase.cerrarConexion();
>>>>>>> 7998acc809af373cb1357cb266b68ec731fb77c7
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
<<<<<<< HEAD
            PreparedStatement sentencia = prepareStatement("select idCurso from curso where nombre = ?");
=======
            PreparedStatement sentencia = conexionBase.conexion.prepareStatement("select idCurso from curso where nombre = ?");
>>>>>>> 7998acc809af373cb1357cb266b68ec731fb77c7
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
