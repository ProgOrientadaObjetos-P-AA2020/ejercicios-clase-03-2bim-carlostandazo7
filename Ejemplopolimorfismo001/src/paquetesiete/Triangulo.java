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
public class Triangulo extends Figura {

    private double base;
    private double altura;

    public void establecerBase(double b) {
        base = b;
    }

    public void establecerAltura(double h) {
        altura = h;
    }

    @Override
    public void calcular_area() {
        area = (base * altura)/2;
    }

    public double obtenerBase() {
        return base;
    }

    public double obtenerAltura() {
        return altura;
    }

}
