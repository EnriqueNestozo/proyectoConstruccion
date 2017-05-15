/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic;

import dataaccess.DataConection;

/**
 *
 * @author Enrique
 */
public class Authentication {
     private String strIdUsuario ="";
   
    public Authentication(){
        strIdUsuario = "";
    }
    
    public boolean getAutorization(String usuario, String contrasena) throws Exception{
        boolean bolLogin = false;
        try{  
            DataConection conexion = new DataConection(usuario, contrasena);
            if (conexion.StateOfConection()){
                //conexion.closerConection();
                bolLogin = true;
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    return bolLogin;    
    }
    
    public int typeOfUser(){
        int typeOfUser = -1;
        return typeOfUser;
    }

    public String getStrIdUsuario() {
        return strIdUsuario;
    }

    public void setStrIdUsuario(String strIdUsuario) {
        this.strIdUsuario = strIdUsuario;
    }
}
