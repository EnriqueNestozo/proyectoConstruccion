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
 * Clase que realiza las acciones para la clase Actividad.
 * Recibe los parámetros de la gui y en base a ellos abre la conexión a la base de datos y realiza las operaciones.
 * @author Jesús Enrique Flores Nestozo
 * @author Fernando Manuel Guzmán Aja
 * @version 1.7
 */
public class ActividadDAO{
    public ActividadDAO() {
    }
    
    /**
     * este metodo recibe una instancia de Actividad y un id curso para almacenar en base de datos
     * @param actividad instancia de actividad
     * @param idCurso string con id del curso
     * @return guardada regresa un booleano confirmando si se guardo
     * @throws SQLException 
     */
    public boolean guardaActividad(Actividad actividad,String idCurso) throws SQLException{
            boolean guardada=false;
            ConexionBD conexionMysql = new ConexionBD();
            conexionMysql.conectar();
            PreparedStatement sentencia=conexionMysql.conexion.prepareStatement("INSERT INTO actividad VALUES (?,?,?,?,?,?,?,?,?,?,?)");
            sentencia.setString(1,null);
            sentencia.setString(2,actividad.getNombreActividad());
            sentencia.setString(3,actividad.getDescripcion());
            sentencia.setInt(4,actividad.getCupo());
            sentencia.setString(5,actividad.getFechaActividad());
            sentencia.setString(6,null);
            sentencia.setString(7,actividad.getHoraInicio());
            sentencia.setString(8,actividad.getHoraFin());
            sentencia.setString(9, actividad.getArea());
            sentencia.setString(10,idCurso);
            sentencia.setString(11,"1");
            if(sentencia.executeUpdate()==1){
                guardada=true;
            }
            conexionMysql.cerrarConexion();
            return guardada;    
        }
    /**
     * este metodo recibe un id de la actividad para borrarla entrando a base de datos
     * @param idActividad string del id de la actividad
     * @return borrado booleano regresa la confirmacion del metodo
     * @throws SQLException 
     * @version 1.2
     */
    public boolean borrarActividad(String idActividad)throws SQLException{
        boolean borrado=false;
        try{
            ConexionBD conexionMysql = new ConexionBD();
            conexionMysql.conectar();
                PreparedStatement sentencia=conexionMysql.conexion.prepareStatement(" UPDATE actividad SET estado= 0 WHERE idActividad = ?");
            sentencia.setString(1, idActividad);
            if(!sentencia.execute()){
                borrado=true;}
            conexionMysql.cerrarConexion();
    }catch(SQLException e){
            System.out.println(e);
    }
        return borrado;
    }
    /**
     * este metodo recibe una instancia de actividad y verifica que este lleno con todos sus parametros
     * @version 1.0
     * @param actividad
     * @return estaVacia retorna un boleano donde confirma si esta vacia o no
     */
    public boolean validar(Actividad actividad){
        boolean estaVacia=false;
        if(actividad.getArea().isEmpty())
            estaVacia=true;
        if(actividad.getCupo() != 0)
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
    
    /**
     * este metodo  obtiene un id de la actividad recibida
     * @param actividad string de la actividad
     * @return el id de la actividad
     * @throws SQLException 
     */
    public String obtenerIdActividad(String actividad) throws SQLException{
        ResultSet resultado = null;
        ConexionBD conexionMysql = new ConexionBD();
        try{
            conexionMysql.conectar();
            PreparedStatement sentencia=conexionMysql.conexion.prepareStatement("select idActividad from actividad where nombre = ?");
            sentencia.setString(1, actividad);
            resultado=sentencia.executeQuery();
            resultado.next();
         conexionMysql.cerrarConexion();
        }catch(SQLException e){
            System.out.println(e);
        }
        return resultado.getString("idActividad");
    }

    /**
     * este metodo obtiene de la base de datos el id maximo que existe para asignar el siguiente id a la nueva actividad por crear
     * @return id de la proxima actividad
     * version 1.4
     * @throws SQLException 
     */
    public String obtenerMaxIdActividad() throws SQLException{
        int idActividad=0;
        ResultSet resultado = null;
        ConexionBD conexionMysql = new ConexionBD();
        try{
            conexionMysql.conectar();
            PreparedStatement sentencia=conexionMysql.conexion.prepareStatement("select max(idActividad) as id from actividad");
            resultado=sentencia.executeQuery();
            resultado.next();
            idActividad =Integer.parseInt(resultado.getString("id"))+1 ;
         conexionMysql.cerrarConexion();
        }catch(SQLException e){
            System.out.println(e);
        }
        return String.valueOf(idActividad);
    }
    
    /**
     * este metodo creauna lista de Actividades dependiendo del idioma recibido
     * @param idioma string del idioma seleccionado
     * @version 1.2
     * @return lista de las actividades por idioma
     * @throws SQLException 
     */
    public List<Actividad> mostrarActividadIdioma(String idioma) throws SQLException{
        List<Actividad> listaActividadIdioma = new ArrayList();
        ConexionBD conexionMysql = new ConexionBD();
        try{
            conexionMysql.conectar();
            PreparedStatement sentencia = conexionMysql.conexion.prepareStatement("select * from actividad where idCurso = ?");
            sentencia.setString(1, idioma);
            ResultSet resultado =sentencia.executeQuery();
            while(resultado.next()){
                Actividad actividad = new Actividad();
                actividad.setNombreActividad(resultado.getString("nombre"));
                listaActividadIdioma.add(actividad);
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        conexionMysql.cerrarConexion();
    return listaActividadIdioma;
    }
    
    public void actualizarCupoDeActividad(Actividad actividad){
        ConexionBD conexionMysql = new ConexionBD();
        try {
            conexionMysql.conectar();
            if(actividad.getArea() == null || actividad.getCupo() == 0){
                actividad = buscarActividad(actividad);
                actividad.setCupo(actividad.getCupo() + 1);
            }
            PreparedStatement sentencia = conexionMysql.conexion.prepareStatement("update actividad set cupo = ? where idActividad = ?");
            sentencia.setInt(1, actividad.getCupo());
            sentencia.setString(2, actividad.getIdActividad());
            sentencia.executeUpdate();
        } catch (Exception e) {
            System.out.println("No se pudo actualizar el cupo de la actividad" + e.getMessage());
        }
    }
    
    public Actividad buscarActividad(Actividad actividad){
        ConexionBD conexionMysql = new ConexionBD();
        Actividad actividadEncontrada = new Actividad();
        try {
            conexionMysql.conectar();
            PreparedStatement sentencia = conexionMysql.conexion.prepareStatement("select * from actividad where idActividad = ?");
            sentencia.setString(1, actividad.getIdActividad());
            ResultSet resultado = sentencia.executeQuery();          
            if(resultado.next()){
                actividadEncontrada.setIdActividad(resultado.getString("idActividad"));
                actividadEncontrada.setNombreActividad(resultado.getString("nombre"));
                actividadEncontrada.setDescripcion(resultado.getString("descripcion"));
                actividadEncontrada.setCupo(resultado.getInt("cupo"));
                actividadEncontrada.setArea(resultado.getString("numeroArea"));
                actividadEncontrada.setFechaActividad(resultado.getString("fechaActividad"));
                actividadEncontrada.setHoraInicio(resultado.getString("horaInicio"));
                actividadEncontrada.setHoraFin(resultado.getString("horaFin"));
                actividadEncontrada.setArea(resultado.getString("numeroArea"));
                actividadEncontrada.setIdCurso(resultado.getString("idCurso"));
            }
        } catch (SQLException e) {
            System.out.println("No se pudo encontrar la actividad" + e.getMessage());
        }
        return actividadEncontrada;
    }

    /**
     * Método que accesa a la base de datos y de acuerdo al alumno devuelve una lista de actividades a las cuales
     * el alumno puede hacer una reservación.
     * @param usuarioAlumno el objeto alumno del cual se quieren desplegar la lista de actividades.
     * @return lista de objetos de tipo actividad
     */
    public List<Actividad> mostrarActividades(Alumno usuarioAlumno){
        List<Actividad> listaDeReservacion = new ArrayList();
        ConexionBD conexionMysql = new ConexionBD();
        try{
            conexionMysql.conectar();
            PreparedStatement sentencia = conexionMysql.conexion.prepareStatement("select DISTINCT actividad.idActividad, actividad.nombre, actividad.descripcion, actividad.cupo,"
            + " actividad.fechaActividad, actividad.idAsesor, actividad.horaInicio, actividad.horaFin, actividad.numeroArea, actividad.idCurso"
            + " from actividad, seccion, curso, inscripcion, asesor, alumno WHERE inscripcion.matricula = ?"
            + " AND actividad.idCurso = seccion.idCurso AND inscripcion.nrc = seccion.nrc ORDER BY idActividad");
            sentencia.setString(1, usuarioAlumno.getMatricula());
            ResultSet resultado = sentencia.executeQuery();
            while(resultado.next()){
                Actividad actividad = new Actividad();
                actividad.setIdActividad(resultado.getString("idActividad"));
                actividad.setNombreActividad(resultado.getString("nombre"));
                actividad.setDescripcion(resultado.getString("descripcion"));
                actividad.setCupo(resultado.getInt("cupo"));
                actividad.setArea(resultado.getString("numeroArea"));
                actividad.setFechaActividad(resultado.getString("fechaActividad"));
                actividad.setHoraInicio(resultado.getString("horaInicio"));
                actividad.setHoraFin(resultado.getString("horaFin"));
                actividad.setArea(resultado.getString("numeroArea"));
                actividad.setIdCurso(resultado.getString("idCurso"));
                listaDeReservacion.add(actividad);
            }
            conexionMysql.cerrarConexion();
        }catch(SQLException e){
            System.out.println("No se pudo obtener la lista de actividades" + e.getMessage());
        }
        return listaDeReservacion;
    } 
}