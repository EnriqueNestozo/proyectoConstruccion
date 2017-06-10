/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Enrique
 */
public class ModeloDeTablaReservaciones extends DefaultTableModel {
    @Override
    public boolean isCellEditable(int fila, int columna){
            return false;
    }
    
}
