/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic.DAOClasses;

import businesslogic.Actividad;
import businesslogic.Alumno;
import dataaccess.ConexionBD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Enrique
 */
public class ActividadDAO extends ConexionBD{

    public ActividadDAO() {
    }
    
    public boolean guardaActividad(Actividad actividad) throws SQLException{
        boolean guardada=false;
        ConexionBD base = new ConexionBD();
        /*if(base.guardarActividad(actividad)){
            guardada=true;
        }*/
    return guardada;
    }   
    
    public List<Actividad> mostrarActividades(Alumno usuarioAlumno){
        List<Actividad> listaDeReservacion = new ArrayList();
        try{
            this.conectar();
            PreparedStatement sentencia = this.conexion.prepareStatement("select DISTINCT actividad.idActividad, actividad.nombre"
                    + "from actividad, seccion, curso, inscripcion, asesor, alumno WHERE inscripcion.matricula = ?"
                    + " AND actividad.idCurso = seccion.idCurso AND inscripcion.nrc = seccion.nrc ORDER BY idActividad");
            sentencia.setString(1, usuarioAlumno.getMatricula());
            ResultSet resultado = sentencia.executeQuery();
            while(resultado.next()){
                //falta hacer una instancia de actividad y meterla a la listadereservacion
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return listaDeReservacion;
    } 
}