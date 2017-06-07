/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataaccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Enrique
 */
public class ConexionBD {
    private static String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static String BD_URL = "jdbc:mysql://localhost/cadi";
    private static String USUARIO = "root";
    private static String CONTRASENIA = "asmodeus";
    protected Connection conexion;
    private Statement estado;
    boolean estadoDeConexion = false;

    public boolean EstadoDeConexion() {
        return estadoDeConexion;
    }
    
    public void conectar() throws SQLException{
        try {
            //"?user=root1&password=123");
            Class.forName(JDBC_DRIVER);
            conexion = DriverManager.getConnection(BD_URL,USUARIO,CONTRASENIA);
            estadoDeConexion = true;
        } catch (Exception ex) {
            System.out.println("Imposible conectar a la base de datos " + ex.getMessage());
        }
    }
    
    public boolean cerrarConexion() throws SQLException{
        if(conexion != null){
            if(!conexion.isClosed()){
                conexion.close();
            }
        }
        return estadoDeConexion;
    }
    /*public boolean guardarActividad(Actividad actividad) throws SQLException{
        conectar();
            
    }
    */
}
