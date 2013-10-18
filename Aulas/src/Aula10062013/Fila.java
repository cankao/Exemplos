/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula10062013;

/**
 *
 * @author Cesumar
 */
public class Fila {
    private String[] valores = new String[40];
    private int tamanho = 0;
    
    public Fila() {
    }
    public int getTamanho() {
        return this.tamanho;
    }

    public void enfileirar(String valor) {
        this.valores[this.tamanho] = valor;
        this.tamanho++;
        
    }

    public String recuperarProximo() {
        String proximo = valores[0];
        for (int i = 1; i < this.tamanho; i++) {
            this.valores[i-1] = this.valores[i];
        }
        this.valores[this.tamanho-1] = null;
        this.tamanho--;
        return proximo;
    }
    public Fila concatenar(Fila outra) {
        Fila novaFila = new Fila();
        
        int tamanhoDestaFila = this.getTamanho();
        for (int i = 0; i < tamanhoDestaFila; i++) {
            novaFila.enfileirar(this.recuperarProximo());
        }

        int tamanhoDaOutraFila = outra.getTamanho();
        for (int i = 0; i < tamanhoDaOutraFila; i++) {
            novaFila.enfileirar(outra.recuperarProximo());
        }                
//        this.trocarDeFila(novaFila);
//        outra.trocarDeFila(novaFila);       
        return novaFila;
    }
//    private void trocarDeFila(Fila novaFila) {
//        int tamanhoDaFila = this.tamanho;        
//        for (int i = 0; i < tamanhoDaFila; i++) {
//            novaFila.enfileirar(this.recuperarProximo());
//        }
//    }
    
    
    public void dividir(Fila f01, Fila f02, Fila f03) {
    	  	int tam = this.tamanho / 2;
    	  	
	    	  	for (int i = 0; i < tam; i++) {
					f01.enfileirar(this.recuperarProximo());
					f02.enfileirar(this.recuperarProximo());
					f03.enfileirar(this.recuperarProximo());
				}
    }
}
