/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic.DAOClasses;

import businesslogic.Actividad;
import businesslogic.Alumno;
import businesslogic.Area;
import businesslogic.Curso;
import com.sun.org.apache.bcel.internal.generic.RETURN;
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
    private PreparedStatement sentencia;
    public ActividadDAO() {
    }
    
public boolean guardaActividad(Actividad actividad,String idCurso) throws SQLException{
    boolean guardada=false;
    this.conectar();
    sentencia=this.conexion.prepareStatement("INSERT INTO actividad VALUES (?,?,?,?,?,?,?,?,?,?)");
    sentencia.setString(1,null);
    sentencia.setString(2,actividad.getNombreActividad());
    sentencia.setString(3,actividad.getDescripcion());
    sentencia.setString(4,actividad.getCupo());
    sentencia.setString(5,actividad.getFechaActividad());
    sentencia.setString(6,null);
    sentencia.setString(7,actividad.getHoraInicio());
    sentencia.setString(8,actividad.getHoraFin());
    sentencia.setString(10,idCurso);
    if(sentencia.executeUpdate()==1){

        guardada=true;
       }
    this.cerrarConexion();
    return guardada;
        
    }
public boolean validar(Actividad actividad){
    boolean estaVacia=false;
    if(actividad.getArea().isEmpty())
        estaVacia=true;
    if(actividad.getCupo().isEmpty())
        estaVacia=true;
    if(actividad.getDescripcion().isEmpty())
        estaVacia=true;
    if(actividad.getFechaActividad().isEmpty())
       estaVacia=true;
    if(actividad.getHoraFin().isEmpty())
        estaVacia=true;
    if(actividad.getHoraInicio().isEmpty())
        estaVacia=true;
    if(actividad.getIdActividad().isEmpty())
        estaVacia=true;
    if(actividad.getNombreActividad().isEmpty())
        estaVacia=true;      
    return estaVacia;    
}

public String obtenerIdActividad() throws SQLException{
    int idActividad=0;
    ResultSet resultado = null;
    try{
        this.conectar();
        sentencia=this.conexion.prepareStatement("select max(idActividad) as id from actividad");
        resultado=sentencia.executeQuery();
        resultado.next();
        idActividad =Integer.parseInt(resultado.getString("id"))+1 ;
     this.cerrarConexion();
    }catch(SQLException e){
        System.out.println(e);
    }
    return String.valueOf(idActividad);
}
public String obtenerIdCurso(String nombreCurso) throws SQLException{
    ResultSet resultado=null;
    try{
        this.conectar();
        sentencia=this.conexion.prepareStatement("select idCurso from curso where nombre = ?");
        sentencia.setString(1, nombreCurso);
        resultado = sentencia.executeQuery();
        resultado.next();
        this.cerrarConexion();
    }catch(SQLException e){
        System.out.println(e);
    }   
    return resultado.getString("idCurso");
    }
public List<Curso>mostrarCursos() throws SQLException{
    List<Curso> listaCursos = new ArrayList();
    try{
        this.conectar(); 
        sentencia=this.conexion.prepareStatement("select * from curso");
        ResultSet resultado =sentencia.executeQuery();
        while(resultado.next()){
            Curso curso = new Curso();
            curso.setIdCurso(resultado.getString("idCurso"));
            curso.setNombreCurso(resultado.getString("nombre"));
            listaCursos.add(curso);
        }
    }catch(SQLException e){
        System.out.println(e);        
    }
        return listaCursos ;
}
public List<Area>mostrarAreas() throws SQLException{
    List<Area> listaAreas = new ArrayList();
    try{
        this.conectar(); 
        sentencia=this.conexion.prepareStatement("select * from area");
        ResultSet resultado =sentencia.executeQuery();
        while(resultado.next()){
            Area area = new Area();
            area.setNumeroArea(resultado.getString("numeroArea"));
            area.setCapacidad(resultado.getString("capacidad"));
            listaAreas.add(area);
        }
    }catch(SQLException e){
                System.out.println(e);
                }
        return listaAreas;
    } 
            
 
public List<Actividad> mostrarActividades(Alumno usuarioAlumno){
List<Actividad> listaDeReservacion = new ArrayList();
try{
    this.conectar();
    PreparedStatement sentencia = this.conexion.prepareStatement("select DISTINCT actividad.idActividad, actividad.nombre"
            + " from actividad, seccion, curso, inscripcion, asesor, alumno WHERE inscripcion.matricula = ?"
            + " AND actividad.idCurso = seccion.idCurso AND inscripcion.nrc = seccion.nrc ORDER BY idActividad");
    sentencia.setString(1, usuarioAlumno.getMatricula());
    ResultSet resultado = sentencia.executeQuery();
    while(resultado.next()){
        Actividad actividad = new Actividad();
        actividad.setIdActividad(resultado.getString("idActividad"));
        actividad.setNombreActividad(resultado.getString("nombre"));
        actividad.setDescripcion(resultado.getString("descripcion"));
        actividad.setCupo(resultado.getString("cupo"));
        actividad.setArea(resultado.getString("numeroArea"));
        actividad.setFechaActividad(resultado.getString("fechaActividad"));
        actividad.setHoraInicio(resultado.getString("horaInicio"));
        actividad.setHoraFin(resultado.getString("horaFin"));

        System.out.println(resultado.getString("idActividad"));
        //falta hacer una instancia de actividad y meterla a la listadereservacion
    }
}catch(SQLException e){
    System.out.println(e.getMessage());
}
this.cerrarConexion();
return listaDeReservacion;
} 
}