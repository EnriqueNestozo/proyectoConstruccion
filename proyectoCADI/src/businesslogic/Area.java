package businesslogic;

/*
 *Clase que crea el objeto de Area
 *@author fernandomanuel
 *@version 1.0
 */
public class Area {
    private String numeroArea="";
    private String capacidad="";

    public Area() {
    }

    public Area(String numeroArea, String capacidad) {
        this.numeroArea = numeroArea;
        this.capacidad = capacidad;
    }
    public String getNumeroArea() {
        return numeroArea;
    }

    public void setNumeroArea(String numeroArea) {
        this.numeroArea = numeroArea;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }
    
}
