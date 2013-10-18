package aula20130621.filas.referenciasComoPonteiros;

public class App {
    
    public static void main(String[] args) {
        
        NoParaListaOuFila n1 = new NoParaListaOuFila("Primeiro",null);
        NoParaListaOuFila n2 = new NoParaListaOuFila("Segundo",null);
        NoParaListaOuFila n3 = new NoParaListaOuFila("Terceiro",null);
        NoParaListaOuFila n4 = new NoParaListaOuFila("Quarto",null);
        NoParaListaOuFila n5 = new NoParaListaOuFila("Quinto",null);
        
        n1.setPróximo(n2).setPróximo(n3).setPróximo(n4).setPróximo(n5);
        
        NoParaListaOuFila aux = n1;
        while (aux != null) {
            System.out.println(aux.getValor());
            aux = aux.getPróximo();
        }
        
        
    }
    
}
