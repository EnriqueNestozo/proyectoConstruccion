/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.event.KeyEvent;
import javax.swing.JTextField;
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
public class AgregarActividadTest {
    
    public AgregarActividadTest() {
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
     * Test of numeroCaracteres method, of class AgregarActividad.
     */
    @Test
    public void testNumeroCaracteres() {
        System.out.println("numeroCaracteres");
        KeyEvent evt = null;
        JTextField campoDeseado = null;
        int numeroLimitar = 0;
        AgregarActividad.numeroCaracteres(evt, campoDeseado, numeroLimitar);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class AgregarActividad.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        AgregarActividad.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
