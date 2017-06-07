/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic;

/**
 *
 * @author fernandomanuel
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
