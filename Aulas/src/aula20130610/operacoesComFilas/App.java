package aula20130610.operacoesComFilas;

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
        
        Fila f03 = f01.concatenar(f01);
        
        int tamanho = f03.getTamanho();        
        for (int i = 0; i < tamanho; i++) {
            String proximo = f03.recuperarProximo();
            System.out.println(proximo);
        }



    }
}
