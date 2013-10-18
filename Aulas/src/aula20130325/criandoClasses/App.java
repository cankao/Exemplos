/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aula20130325.criandoClasses;

/**
 *
 * @author Cesumar
 */
public class App {
    
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Fulano");
        Pessoa p2 = new Pessoa("Beltrano");
        System.out.println("p1.nome = " + p1.getNome());
        System.out.println("p2.nome = " + p2.getNome());
        
    }
    
}
