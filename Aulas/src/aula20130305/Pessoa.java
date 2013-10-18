/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aula20130305;

/**
 *
 * @author Cesumar
 */
public class Pessoa {
    private final String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    public Pessoa mudaNome(String nome) {
        return new Pessoa(nome);
    }
}
