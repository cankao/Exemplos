/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aula20130621.filas.referenciasComoPonteiros;

/**
 *
 * @author Cesumar
 */
public class NoParaListaOuFila {
    
    private NoParaListaOuFila próximo;
    private Object valor;
    
    public NoParaListaOuFila(Object valor, NoParaListaOuFila próximo) {
        this.valor = valor;
        this.próximo = próximo;        
    }
    public NoParaListaOuFila setPróximo(NoParaListaOuFila outro) {
        this.próximo = outro;
        return outro;
    }

    public Object getValor() {
        return valor;
    }

    public NoParaListaOuFila getPróximo() {
        return próximo;
    }
    
    
}
