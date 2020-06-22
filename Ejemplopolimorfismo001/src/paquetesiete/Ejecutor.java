/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetesiete;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int contador;
        /*
        clase uno abstracta llamada Figura; con atributos:
        características y área; la clase debe tener un método
        abstracto calcular_area.
        - clase llamada Triángulo (hereda de Figura); con
        atributos: base y altura.
        - clase llamada Rombo (hereda de Figura) con atributo: diagonal_menor y 
        diagonal mayor.
        - clase llamada Cuadrado (hereda Figura) con: atributos: lado.
        - clase Ejecutor, que permite generar:
            4 objetos de tipo Cuadrado
            3 objetos de tipo Rombo
            5 objeto de Triángulo 
            Comprobar el concepto del polimorfismo.
         */

        // inicio de la solución
        ArrayList<Figura> figuras = new ArrayList<>();
        System.out.println("MENU");
        System.out.println("Triangulo    [1]");
        System.out.println("Rombo        [2]");
        System.out.println("Cuadrado     [3]");
        System.out.println("Ingrese el objeto que desea calcular");
        int op = entrada.nextInt();
        entrada.nextLine();
        if (op == 1) {
            for (int i = 0; i < 5; i++) {
                Triangulo t = new Triangulo();
                System.out.println("Ingrese el valor de la base del triangulo");
                double base = entrada.nextDouble();
                System.out.println("Ingrese el valor de la altura del triangulo");
                double altura = entrada.nextDouble();

                t.establecerBase(base);
                t.establecerAltura(altura);

                figuras.add(t);
            }
        }
        if (op == 2) {
            for (int i = 0; i < 3; i++) {
                Rombo r = new Rombo();
                System.out.println("Ingrese el valor de la diagonal mayor");
                double mayor = entrada.nextDouble();
                System.out.println("Ingrese el valor de la diagonal menor");
                double menor = entrada.nextDouble();

                r.establecerDiagonalMayor(mayor);
                r.establecerDiagonalMenor(menor);

                figuras.add(r);
            }
        }
        if (op == 3) {
            for (int i = 0; i < 4; i++) {
                Cuadrado c = new Cuadrado();
                System.out.println("Ingrese el valor del lado del cuadrado");
                double lado = entrada.nextDouble();
                c.establecerLado(lado);

                figuras.add(c);
            }
        }

        // proceso para comprobar el polimorfismo
        for (int i = 0; i < figuras.size(); i++) {
            // 1.  
            figuras.get(i).calcular_area();

            System.out.printf("Datos de Figura\n"
                    + "%s\n",
                    figuras.get(i));
        }
    }

}
