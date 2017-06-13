package businesslogic;

import dataaccess.ConexionBD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/*
 * Esta clase es para realizar la autenticación de los usuarios que quieren acceder al sistema.
 * Únicamente podrán accesar aquellos que están registrados en la base de datos.
 * @author Jesús Enrique Flore Nestozo
 * @version 1.2
 */
public class Autenticacion{
     private String idUsuario ="";
   
    public Autenticacion(){
        idUsuario = "";
    }
    /**
     * Método que busca el usuario ingresado en la base de datos para ver si este existe y de ser así ver qué
     * tipo de usuario es.
     * @param usuario objeto de tipo Usuario el cual contiene el nombre de usuario y la contraseña ingresada
     * @return true si encontró el usuario y este además coincide con la contraseña ingresada; false si el
     * usuario ingresado no se encuentra en la base de datos o no coinciden los datos.
     * @throws Exception si no pudo llevar a cabo la conexión con la base de datos.
     */
    public boolean buscarUsuario(Usuario usuario) throws Exception{
        boolean autorizacion = false;
        ConexionBD conexionMysql = new ConexionBD();
        try{  
            conexionMysql.conectar();
            PreparedStatement sentencia = conexionMysql.conexion.prepareStatement("select * from usuario where nombreUsuario = ? and contrasena = md5(?)");
            sentencia.setString(1, usuario.getNombreUsuario());
            sentencia.setString(2, usuario.getContrasenia());
            ResultSet resultado = sentencia.executeQuery();
            if(resultado.next()){
                autorizacion = true;
                usuario.setTipo(resultado.getString("tipo"));
                usuario.setIdUsuario(resultado.getString("idUsuario"));
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally{
            conexionMysql.cerrarConexion();
        }
    return autorizacion;    
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }
}
