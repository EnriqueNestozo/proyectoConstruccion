/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic.DAOClasses;

import businesslogic.Area;
import dataaccess.ConexionBD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *Clase que realiza las acciones para la clase area.
 * Recibe los parámetros de la gui y en base a ellos abre la conexión a la base de datos y realiza las operaciones.
 * @author fernandomanuel
 * @version 1.2
 */
public class AreaDAO {
    /**
     * Metodo que genera una lista de las areas existentes en el campus
     * @return lista de areas
     * @throws SQLException 
     */
    public List<Area> mostrarAreas() throws SQLException {
        List<Area> listaAreas = new ArrayList();
        ConexionBD conexionMysql = new ConexionBD();
        try {
            conexionMysql.conectar();
            PreparedStatement sentencia = conexionMysql.conexion.prepareStatement("select * from area");
            ResultSet resultado = sentencia.executeQuery();
            while (resultado.next()) {
                Area area = new Area();
                area.setNumeroArea(resultado.getString("numeroArea"));
                area.setCapacidad(resultado.getString("capacidad"));
                listaAreas.add(area);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return listaAreas;
    }
    
}
