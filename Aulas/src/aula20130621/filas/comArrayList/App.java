package aula20130621.filas.comArrayList;

import aula20130617.filas.comArray.*;

public class App {

    public static void main(String[] args) {

        Fila f01 = new Fila();
        f01.enfileirar("Fulano");
        f01.enfileirar("Beltrano");
        f01.enfileirar("Josias");
        
        //esvaziarFila(f01);
        
        Fila f02 = new Fila();
        f02.enfileirar("Maria");
        f02.enfileirar("Joaquina");
        
        Fila f03 = f02.concatenar(f01);
        //esvaziarFila(f03);
        
        System.out.println("*** rachadas ***");
        Fila[] filasRachadas = f03.racharEmFilasCom(4);
        for (Fila fila : filasRachadas) {
            esvaziarFila(fila);
        }
        
//        String s1 = "teste";
//        String s2 = "teste";
//        if (s1.equals(s2)) {
//            System.out.println("Olha, s1 equals s2!!!   :)");
//        }
//        Fila f10 = new Fila();
//        Fila f11 = new Fila();      
//        System.out.println("f10.equals(f11)??? ==> " + f10.equals(f11));        
//        
//        f10.enfileirar("Eu");
//        f11.enfileirar("Eu");
//        System.out.println("f10.equals(f11)??? ==> " + f10.equals(f11));
//        
//        f11.enfileirar("Outra pessoa");
//        System.out.println("f10.equals(f11)??? ==> " + f10.equals(f11));
        

        //Vai resultar em uma nova fila vazia, pois f02 e f01 já haviam sido esvaziadas pelo método concatenar.
        //Fila f04 = f02.concatenar(f01);
        //esvaziarFila(f04);
        
          

    }

    private static void esvaziarFila(Fila f) {
        System.out.println("-- início --");
        //        System.out.println("Proximo da f01 é = " + f01.recuperarProximo());
        //        System.out.println("Proximo da f01 é = " + f01.recuperarProximo());
        //        }
        //        System.out.println("Proximo da f01 é = " + f01.recuperarProximo());
                
        //        int tamanho = f01.getTamanho();
        //        for (int i = 0; i < tamanho; i++) {
        //            System.out.println("Proximo da f01 é = " + f01.recuperarProximo());
        //        }

        //        String proximo = null;
        //        while ( (proximo = f01.recuperarProximo()) != null) {
        //            System.out.println("Proximo da f01 é = " + proximo);
        //        }

                while ( f.naoEstiverVazia() ) {
                    System.out.println("Proximo da fila é = " + f.recuperarProximo());
                }
        System.out.println("-- fim --");
    }
}
