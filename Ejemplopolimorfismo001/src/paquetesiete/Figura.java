/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetesiete;

/**
 *
 * @author reroes
 */
public abstract class Figura {

    protected double area;

    public abstract void calcular_area();

    public double obtenerArea() {
        return area;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("Area: %.2f",
                area);
        return cadena;
    }

}
