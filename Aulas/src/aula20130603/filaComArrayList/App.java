package aula20130603.filaComArrayList;

public class App {
    
    public static void main(String[] args) {
        Fila f01 = new Fila();
        f01.enfileirar("Fulano");
        f01.enfileirar("Beltrano");
        f01.enfileirar("Josias");
        System.out.println(f01.recuperarProximo());
        System.out.println(f01.recuperarProximo());
        System.out.println(f01.recuperarProximo());
        System.out.println(f01.recuperarProximo());
    }
    
}
