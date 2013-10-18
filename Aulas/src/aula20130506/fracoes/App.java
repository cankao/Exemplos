/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aula20130506.fracoes;

/**
 *
 * @author Cesumar
 */
public class App {
    
    public static void main(String[] args) {
        NumeroFracionario f1 = new NumeroFracionario(1,3);
        //f1.numerador = 1;
        //f1.denominador = 3;
        NumeroFracionario f2 = new NumeroFracionario(2,3);
        //f2.numerador = 2;
        //f2.denominador = 3;
        NumeroFracionario f3 = f1.somar(f2);
        System.out.println("f1=" + f1);
        System.out.println("f2=" + f2);
        System.out.println("f3=" + f3);
        
    }
}
