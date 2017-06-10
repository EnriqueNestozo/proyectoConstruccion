/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Enrique
 */
public class AutenticacionTest {
    
    public AutenticacionTest() {
    }

    /**
     * Test of buscarUsuario method, of class Autenticacion.
     */
    @Test
    public void testBuscarUsuarioCorrecto() throws Exception {
        System.out.println("buscarUsuario");
        Usuario usuario = new Usuario();
        usuario.setNombreUsuario("recep_flo");
        usuario.setContrasenia("re3344876");
        Autenticacion instance = new Autenticacion();
        boolean expResult = true;
        boolean result = instance.buscarUsuario(usuario);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testBuscarUsuarioIncorrecto() throws Exception {
        System.out.println("buscarUsuario");
        Usuario usuario = new Usuario();
        usuario.setNombreUsuario("enrique");
        usuario.setContrasenia("1234");
        Autenticacion instance = new Autenticacion();
        boolean expResult = false;
        boolean result = instance.buscarUsuario(usuario);
        assertEquals(expResult, result);
    }

    /**
     * Test of getIdUsuario method, of class Autenticacion.
     */
    @Test
    public void testGetIdUsuario() {
        System.out.println("getIdUsuario");
        Autenticacion instance = new Autenticacion();
        String expResult = "";
        String result = instance.getIdUsuario();
        assertEquals(expResult, result);
    }

    /**
     * Test of setIdUsuario method, of class Autenticacion.
     */
    @Test
    public void testSetIdUsuario() {
        System.out.println("setIdUsuario");
        String idUsuario = "";
        Autenticacion instance = new Autenticacion();
        instance.setIdUsuario(idUsuario);
    }
    
}
