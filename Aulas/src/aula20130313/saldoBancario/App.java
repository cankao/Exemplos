/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aula20130313.saldoBancario;

/**
 *
 * @author Cesumar
 */
public class App {
    
    public static void main(String[] args) {
        
        Saldo saldoDoMarido = new Saldo();
        Saldo saldoDaEsposa = saldoDoMarido;
        saldoDoMarido.valor = 5000d;
        
        System.out.println("Saldo do marido = " + saldoDoMarido.valor);
        System.out.println("Saldo da esposa = " + saldoDaEsposa.valor);

        saldoDaEsposa.valor -= 239.99;
        
        System.out.println("Saldo do marido = " + saldoDoMarido.valor);
        System.out.println("Saldo da esposa = " + saldoDaEsposa.valor);
        
        System.out.println(saldoDoMarido);
        System.out.println(saldoDaEsposa);
    }
    
}





