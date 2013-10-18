/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aula20130311;

import java.awt.Rectangle;

/**
 *
 * @author Cesumar
 */
public class App {

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5, 10, 15, 20);
        mostrarCoordenadasXeY(r1);
        r1.translate(20, 75);
        mostrarCoordenadasXeY(r1);
        Rectangle r2 = r1;
        r2.translate(100, 200);
        System.out.println(new String("Valores de R1"));
        mostrarCoordenadasXeY(r1);
        System.out.println(new String("Valores de R2"));
        mostrarCoordenadasXeY(r2);
    }

    private static void mostrarCoordenadasXeY(Rectangle r) {
        System.out.println("X = " + r.getX() + " e Y = " + r.getY());
    }
}
