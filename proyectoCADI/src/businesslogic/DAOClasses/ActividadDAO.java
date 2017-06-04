/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic.DAOClasses;

import businesslogic.Actividad;
import dataaccess.ConexionBD;
import java.sql.SQLException;

/**
 *
 * @author Enrique
 */
public class ActividadDAO {

    public ActividadDAO() {
    }
    
public boolean guardaActividad(Actividad actividad) throws SQLException{
    boolean guardada=false;
    ConexionBD base = new ConexionBD();
    if(base.guardarActividad(actividad)){
        guardada=true;
    }
    return guardada;
}
}