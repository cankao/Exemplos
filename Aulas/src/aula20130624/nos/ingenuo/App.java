package aula20130624.nos.ingenuo;

public class App {
    
    public static void main(String[] args) {
        
        No n1 = new No();
        No n2 = new No();
        No n3 = new No();
        
        n1.setValor("A");
        n1.setProximo(n2);
        
        n2.setValor("B");
        n2.setProximo(n3);
        
        n3.setValor("C");
        n3.setProximo(null);
        
        
    }
    
}
