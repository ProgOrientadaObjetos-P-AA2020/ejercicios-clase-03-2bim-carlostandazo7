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
public class Rombo extends Figura {

    private double diagonalMenor;
    private double diagonalMayor;

    public void establecerDiagonalMenor(double menor) {
        diagonalMenor = menor;
    }

    public void establecerDiagonalMayor(double mayor) {
        diagonalMayor = mayor;
    }

    @Override
    public void calcular_area() {
        area = (diagonalMayor * diagonalMenor) / 2;
    }

    public double obtenerDiagonalMenor() {
        return diagonalMenor;
    }

    public double obtenerDiagonalMayor() {
        return diagonalMayor;
    }

}
