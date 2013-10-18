/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aula20130325.criandoClasses;

/**
 *
 * @author Cesumar
 */
public class Pessoa {
    //Atributos estáticos são atributos da classe, compartilhados por todas as intâncias dessa classe.
    //private static String nome;
    //Atributos não-estáticos são atributos da instância, cada intância armazena o seu valor.
    private String nome;
    
    public Pessoa(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return this.nome;
    }
    
}
