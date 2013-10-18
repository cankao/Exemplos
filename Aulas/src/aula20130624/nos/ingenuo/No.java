package aula20130624.nos.ingenuo;

public class No {
    private String valor;
    private No proximo;
    
    public String getValor() {
        return this.valor;
    }
    public No getProximo() {
        return this.proximo;
    }
    public void setValor(String valor) {
        this.valor = valor;
    }
    public void setProximo(No proximo) {
        this.proximo = proximo;
    }
    
}
