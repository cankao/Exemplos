/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aula20130401.implementandoClasses;

/**
 *
 * @author Cesumar
 */
public class App {
    
    public static void main(String[] args) {
        ContaCorrente c1 = new ContaCorrente();
        ContaCorrente c2 = new ContaCorrente(1000);
        
        c1.depositar(100);
        c1.depositar(100);
        c1.depositar(100);
        c1.sacar(10);
        c1.sacar(10);
        c1.sacar(10);
        System.out.println("O saldo da conta 1="+c1.obterSaldo());
        System.out.println("O saldo esperado é de R$ 270,00, o saldo real é=" + c1.obterSaldo());
        
        c2.depositar(50);
        c2.depositar(50);
        c2.depositar(50);
        c2.sacar(15);
        c2.sacar(15);
        c2.sacar(15);
        System.out.println("O saldo esperado é de R$ 1.105,00, o saldo real é=" + c2.obterSaldo());
        
        int valor1 = 1;
        int valor2 = 1;
        System.out.println("A soma de 1+1 deve ser 2, o valor real é=" + (valor1+valor2));
        
        
    }
    
}
