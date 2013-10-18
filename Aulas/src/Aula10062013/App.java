package Aula10062013;

public class App {
	
    public static void main(String[] args) {

        Fila f01 = new Fila();
        f01.enfileirar("Fulano");
        f01.enfileirar("Beltrano");
        f01.enfileirar("Josias");
        
                
        Fila f02 = new Fila();
        f02.enfileirar("Maria");
        f02.enfileirar("Josefina");
        f02.enfileirar("Crislaine");
        f02.enfileirar("Jogenalda");
        f02.enfileirar("Sigfrilda");
        f02.enfileirar("Mafalda");
        f02.enfileirar("gerusa");
        f02.enfileirar("clotilde");
        
        Fila f03 = new Fila();
        f02.enfileirar("Josefina");
        f02.enfileirar("Clodoaldo");
        f02.enfileirar("Gislaine");
        f02.enfileirar("Vera");
        f02.enfileirar("Cleide");
        f02.enfileirar("Mariane");
        f02.enfileirar("Rosa");
        f02.enfileirar("Rafaela");
        f02.enfileirar("Tadeu");
        
        Fila f04 = f01.concatenar(f02);
        
        f04.dividir(f01, f02, f03);
        
        int tamanho = -1; 

        System.out.println("======Fila 1======");
        tamanho = f01.getTamanho();        
        for (int i = 0; i < tamanho; i++) {
            String proximo = f01.recuperarProximo();
            System.out.println(proximo);
        }
        
        System.out.println("======Fila 2======");
        tamanho = f02.getTamanho();        
        for (int i = 0; i < tamanho; i++) {
            String proximo = f02.recuperarProximo();
            System.out.println(proximo);
        }

        System.out.println("======Fila 3======");
        tamanho = f03.getTamanho();        
        for (int i = 0; i < tamanho; i++) {
            String proximo = f03.recuperarProximo();
            System.out.println(proximo);
        }
        

    }
}
