/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic.DAOClasses;

import businesslogic.Actividad;
import businesslogic.Alumno;
import businesslogic.Reservacion;
import java.sql.ResultSet;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Enrique
 */
public class ReservacionDAOTest {
    
    public ReservacionDAOTest() {
    }

    /**
     * Test of crear method, of class ReservacionDAO.
     */
    @Test
    public void testCrear() {
        System.out.println("crear");
        Alumno alumno = null;
        Actividad actividad = null;
        ReservacionDAO instance = new ReservacionDAO();
        boolean expResult = false;
        boolean result = instance.crear(alumno, actividad);
        assertEquals(expResult, result);
    }

    /**
     * Test of mostrarReservaciones method, of class ReservacionDAO.
     */
    @Test
    public void testMostrarReservaciones() {
        System.out.println("mostrarReservaciones");
        Alumno alumno = null;
        ReservacionDAO instance = new ReservacionDAO();
        List<Reservacion> expResult = null;
        List<Reservacion> result = instance.mostrarReservaciones(alumno);
        assertEquals(expResult, result);
    }

    /**
     * Test of crearListaDeReservaciones method, of class ReservacionDAO.
     */
    @Test
    public void testCrearListaDeReservaciones() {
        System.out.println("crearListaDeReservaciones");
        ResultSet resultado = null;
        ReservacionDAO instance = new ReservacionDAO();
        List<Reservacion> expResult = null;
        List<Reservacion> result = instance.crearListaDeReservaciones(resultado);
        assertEquals(expResult, result);
    }

    /**
     * Test of buscarReservacion method, of class ReservacionDAO.
     */
    @Test
    public void testBuscarReservacion() {
        System.out.println("buscarReservacion");
        Alumno alumno = null;
        Actividad actividad = null;
        ReservacionDAO instance = new ReservacionDAO();
        boolean expResult = false;
        boolean result = instance.buscarReservacion(alumno, actividad);
        assertEquals(expResult, result);
    }

    /**
     * Test of eliminarReservacion method, of class ReservacionDAO.
     */
    @Test
    public void testEliminarReservacion() {
        System.out.println("eliminarReservacion");
        Reservacion reservacion = null;
        ReservacionDAO instance = new ReservacionDAO();
        boolean expResult = false;
        boolean result = instance.eliminarReservacion(reservacion);
        assertEquals(expResult, result);
    }
    
}
