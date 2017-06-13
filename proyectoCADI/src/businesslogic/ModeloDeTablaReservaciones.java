
package businesslogic;

import javax.swing.table.DefaultTableModel;

/**
 * Clase que crea un modelo de tabla para las reservaciones que extiende de modelo de tabla por defecto,
 * para sobreescribir el método isCellEditable.
 * @author Jesús Enrique Flores Nestozo
 * @version 1.0
 */
public class ModeloDeTablaReservaciones extends DefaultTableModel {
    /**
     * Método que no permite que las celdas de la tabla sean editables.
     * @param fila la fila de la tabla
     * @param columna la columna de la tabla
     * @return false para que la celda en X,Y no sea editable
     */
    @Override
    public boolean isCellEditable(int fila, int columna){
            return false;
    }
    
}
