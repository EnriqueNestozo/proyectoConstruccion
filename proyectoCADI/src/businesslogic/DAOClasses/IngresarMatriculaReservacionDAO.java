/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic.DAOClasses;
import dataaccess.ConexionBD;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Enrique
 */
public class IngresarMatriculaReservacionDAO extends ConexionBD {

    public boolean verificarReservacion(){
        boolean verificado = false;
        try {
            this.conectar();
        } catch (SQLException ex) {
            Logger.getLogger(IngresarMatriculaReservacionDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return verificado;
    }
}
