/**
 * Clase que sirve de conexión a la base de datos en mysql para la extracción de información.
 * @param DIRECCION_DE_BASE_DE_DATOS es la dirección donde se encuentra alojada la base de datos de donde se extraerá la información
 * @param USUARIO el usuario utilizado para la base de datos con sus respectivos permisos
 * @param CONTRASENIA la contraseña utilizada para acceder a la base de datos.
 * @author: Jesús Enrique Flores Nestozo
 * @version: 1.1
 */
package dataaccess;

import businesslogic.Actividad;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Construcctor de la clase
 * @author Jesús Enrique Flores Nestozo
 */
public class ConexionBD {
    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DIRECCION_DE_BASE_DE_DATOS = "jdbc:mysql://localhost/cadi";
    private static final String USUARIO = "CADI_USER";
    private static final String CONTRASENIA = "nestozo";
    public Connection conexion;
    boolean estadoDeConexion = false;

    /**
     * método para saber el estado de la conexión. 
     * @return regresa true si está abierta o false si no lo está
     */
    public boolean EstadoDeConexion() {
        return estadoDeConexion;
    }

    /**
    * Clase que realiza la conexión a la base de datos según los parámetros ingresados.
    * 
    * @throws SQLException si hay algun error con la conexión a la base de datos.
    */    
    public void conectar() throws SQLException{
        try {
            //"?user=root1&password=123");
            Class.forName(JDBC_DRIVER);
            conexion = DriverManager.getConnection(DIRECCION_DE_BASE_DE_DATOS,USUARIO,CONTRASENIA);
            estadoDeConexion = true;
        } catch (Exception ex) {
            System.out.println("Imposible conectar a la base de datos " + ex.getMessage());
        }
    }
    
    /**
     * Método para cerrar la conexión con la base de datos.
     * @return regresa el estado de la conexión despues de ejecutar el método.
     * @throws SQLException si hay algún problema a la hora de intentar cerrar la conexión
     */
    public boolean cerrarConexion() throws SQLException{
        if(conexion != null){
            if(!conexion.isClosed()){
                conexion.close();
            }
        }
        return estadoDeConexion;
    }
}
