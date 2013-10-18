/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aula20130401.implementandoClasses;

/**
 * Representar uma conta corrente bancária na qual depósitos e saques são efetuados e tal movimentação
 * resulta em um saldo. A partir de uma conta corrente deve ser possível consultar seu saldo.
 * 
 * @author Cesumar
 */
public class ContaCorrente {
    private double saldo;

    /*
     * Construtor padrão (default constructor) da classe ContaCorrente, responsável por inicializar
     * o saldo inicial.
     */
    public ContaCorrente() {
        this.saldo = 0;
    }

    /**
     * Construtor alternativo da classe ContaCorrente que recebe como parâmetro um saldo que será atribuído
     * para o atributo saldo da conta.
     * 
     * @param saldo Valor inicial do saldo da conta corrente
     */
    public ContaCorrente(double saldo) {
        //Aqui atribuímos o parâmetro saldo ao atributo saldo.
        this.saldo = saldo;
    }
    /**
     * Permite que um valor seja depositado na conta corrente, aumentando seu saldo.
     * 
     * @param valor O valor do depósito.
     */
    public void depositar(double valor) {
        //this.saldo = this.saldo + valor;
        this.saldo += valor;        
    }
    /**
     * Permite que um valor seja sacado da conta corrente, reduzindo seu saldo.
     * @param valor 
     */
    public void sacar(double valor) {
        this.saldo -= valor;
    }
    /**
     * Recupera o saldo atual da conta corrente
     * 
     * @return Saldo atual;
     */
    public double obterSaldo() {
        return this.saldo;                
    }
    
    
}
