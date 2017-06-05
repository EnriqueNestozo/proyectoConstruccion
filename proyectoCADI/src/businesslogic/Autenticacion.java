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
     private String strIdUsuario ="";
   
    public Autenticacion(){
        strIdUsuario = "";
    }
    
    public boolean buscarUsuario(Usuario usuario) throws Exception{
        boolean autorizacion = false;
        try{  
            this.conectar();
            PreparedStatement estado = this.conexion.prepareStatement("select usuario where nombreUsuario =? and contrasena = ?");
            estado.setString(1, usuario.getNombreUsuario());
            estado.setString(2, "(md5(" + usuario.getContrasenia() + ")");
            ResultSet resultado = estado.executeQuery();
            if(resultado.next()){
                autorizacion = true;
                usuario.setTipo(resultado.getString("tipo"));
                usuario.setIdUsuario(resultado.getString("idUsuario"));
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    return autorizacion;    
    }

    public String getStrIdUsuario() {
        return strIdUsuario;
    }

    public void setStrIdUsuario(String strIdUsuario) {
        this.strIdUsuario = strIdUsuario;
    }
}
