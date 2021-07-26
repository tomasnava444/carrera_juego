/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrera_juego;

/**
 *
 * @author User
 */
public class Nodo {
     String conductor ;
    int carril ;
    int km ;
    int pos;
    Nodo liga;

    public Nodo() {
        this.conductor = conductor;
        this.carril = carril;
        this.km = km;
        this.pos=pos;
        this.liga = null;
    }

   

    
    public String getConductor() {
        return conductor;
    }

    public void setConductor(String conductor) {
        this.conductor = conductor;
    }

    public int getCarril() {
        return carril;
    }

    public void setCarril(int carril) {
        this.carril = carril;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public Nodo getLiga() {
        return liga;
    }

    public void setLiga(Nodo liga) {
        this.liga = liga;
    }

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }
    
}
