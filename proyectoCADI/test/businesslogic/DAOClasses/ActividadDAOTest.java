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
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author fernandomanuel
 */
public class ActividadDAOTest {
    
    public ActividadDAOTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of guardaActividad method, of class ActividadDAO.
     */
    @Test
    public void testGuardaActividad() throws Exception {
        System.out.println("guardaActividad");
        Actividad actividad = null;
        String idCurso = "";
        ActividadDAO instance = new ActividadDAO();
        boolean expResult = false;
        boolean result = instance.guardaActividad(actividad, idCurso);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validar method, of class ActividadDAO.
     */
    @Test
    public void testValidar() {
        System.out.println("validar");
        Actividad actividad = null;
        ActividadDAO instance = new ActividadDAO();
        boolean expResult = false;
        boolean result = instance.validar(actividad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerIdActividad method, of class ActividadDAO.
     */
    @Test
    public void testObtenerIdActividad() throws Exception {
        System.out.println("obtenerIdActividad");
        String actividad = "";
        ActividadDAO instance = new ActividadDAO();
        String expResult = "";
        String result = instance.obtenerIdActividad(actividad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of borrarActividad method, of class ActividadDAO.
     */
    @Test
    public void testBorrarActividad() {
        System.out.println("borrarActividad");
        String idActividad = "";
        ActividadDAO instance = new ActividadDAO();
        boolean expResult = false;
        boolean result = instance.borrarActividad(idActividad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerMaxIdActividad method, of class ActividadDAO.
     */
    @Test
    public void testObtenerMaxIdActividad() throws Exception {
        System.out.println("obtenerMaxIdActividad");
        ActividadDAO instance = new ActividadDAO();
        String expResult = "";
        String result = instance.obtenerMaxIdActividad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerIdCurso method, of class ActividadDAO.
     */
    @Test
    public void testObtenerIdCurso() throws Exception {
        System.out.println("obtenerIdCurso");
        String nombreCurso = "";
        ActividadDAO instance = new ActividadDAO();
        String expResult = "";
        String result = instance.obtenerIdCurso(nombreCurso, this);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mostrarCursos method, of class ActividadDAO.
     */
    @Test
    public void testMostrarCursos() throws Exception {
        System.out.println("mostrarCursos");
        ActividadDAO instance = new ActividadDAO();
        List<Curso> expResult = null;
        List<Curso> result = instance.mostrarCursos(this);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mostrarAreas method, of class ActividadDAO.
     */
    @Test
    public void testMostrarAreas() throws Exception {
        System.out.println("mostrarAreas");
        ActividadDAO instance = new ActividadDAO();
        List<Area> expResult = null;
        List<Area> result = instance.mostrarAreas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mostrarActividadIdioma method, of class ActividadDAO.
     */
    @Test
    public void testMostrarActividadIdioma() throws Exception {
        System.out.println("mostrarActividadIdioma");
        String idioma = "";
        ActividadDAO instance = new ActividadDAO();
        List<Actividad> expResult = null;
        List<Actividad> result = instance.mostrarActividadIdioma(idioma);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mostrarActividades method, of class ActividadDAO.
     */
    @Test
    public void testMostrarActividades() {
        System.out.println("mostrarActividades");
        Alumno usuarioAlumno = null;
        ActividadDAO instance = new ActividadDAO();
        List<Actividad> expResult = null;
        List<Actividad> result = instance.mostrarActividades(usuarioAlumno);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
