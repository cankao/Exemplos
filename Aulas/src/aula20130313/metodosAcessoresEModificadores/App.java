/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aula20130313.metodosAcessoresEModificadores;

import java.awt.Rectangle;

/**
 *
 * @author Cesumar
 */
public class App {
    
    public static void main(String[] args) {
        Rectangle r  = new Rectangle(1,1, 20,40);
        System.out.println("Valor de x=" + r.getX());
        System.out.println("Valor de y=" + r.getY());
        //r.chafurdar();
        System.out.println("Valor de x=" + r.getX());
        System.out.println("Valor de y=" + r.getY());
    }
    /*
        Supondo que o código acima apresentado compile e execute
        normalmente, analise a seguinte saída do console e determine
        a natureza do método chafurdar(). 

        //--------------
        Valor de x=1
        Valor de y=1
        Valor de x=2
        Valor de y=2
        //--------------
     
     */
}
