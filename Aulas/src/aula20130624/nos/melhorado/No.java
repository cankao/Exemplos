package aula20130624.nos.melhorado;

import aula20130624.nos.ingenuo.*;

public class No {
    private String valor;
    private No proximo;

    public No(String valor) {
        this.valor = valor;
        this.proximo = null;
    }
    
    public String getValor() {
        return this.valor;
    }
    public No getProximo() {
        return this.proximo;
    }
    public No setProximo(No proximo) {
        this.proximo = proximo;
        return this.proximo;
    }
    
}
