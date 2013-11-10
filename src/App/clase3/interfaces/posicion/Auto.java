/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package App.clase3.interfaces.posicion;

/**
 *
 * @author alumno
 */
public class Auto implements Position{
    private int numeroPuertas;
    private String color;
    
    private double longitud;
    private double latitud;

    public Auto(double longitud, double latitud) {
        this.longitud = longitud;
        this.latitud = latitud;
    }
 
    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public double getLongitud() {
        return this.longitud;
    }

    @Override
    public double getLatitud() {
        return this.latitud;
    }
    
    
}