/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectocadi;

import gui.Login;
import gui.MenuAlumno;
import gui.MenuCoordinador;

/**
 *
 * @author Enrique
 */
public class ProyectoCADI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Login login = new Login();
        login.setVisible(true);
        MenuCoordinador menu = new MenuCoordinador();
        menu.setVisible(true);
        MenuAlumno menu2 = new MenuAlumno();
        menu2.setVisible(true);
    }
    
}
