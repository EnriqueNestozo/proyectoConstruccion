/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic;

import dataaccess.ConexionBD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Enrique
 */
public class Autenticacion extends ConexionBD {
     private String idUsuario ="";
   
    public Autenticacion(){
        idUsuario = "";
    }
    
    public boolean buscarUsuario(Usuario usuario) throws Exception{
        boolean autorizacion = false;
        try{  
            this.conectar();
            PreparedStatement sentencia = this.conexion.prepareStatement("select * from usuario where nombreUsuario = ? and contrasena = md5(?)");
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
            this.cerrarConexion();
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
