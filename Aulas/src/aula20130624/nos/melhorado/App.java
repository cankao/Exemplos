package aula20130624.nos.melhorado;

import aula20130624.nos.ingenuo.*;

public class App {

    public static void main(String[] args) {

        No n1 = new No("X");
        No n2 = new No("B");
        No n3 = new No("C");
        n1.setProximo(n2).setProximo(n3);

        //n1.setValor("A");
        //n1.setProximo(n2);

        //n2.setValor("B");
        //n2.setProximo(n3);

        //n3.setValor("C");
        //n3.setProximo(null);
        listarNos(n1);
        System.out.println("-- maior --");
        System.out.println( obterMaiorNo(n1).getValor() );

    }

    public static void listarNos(No n) {

        while (n != null) {
            System.out.println(n.getValor());
            n = n.getProximo();
        }
        /*
        System.out.println(n.getValor());
        n = n.getProximo();
        System.out.println(n.getValor());
        n = n.getProximo();
        System.out.println(n.getValor());
        n = n.getProximo();
        System.out.println(n.getValor());
        */ 
    }
    public static No obterMaiorNo(No n) {
        No maior = n;
        while (n != null) {
            if (maior.getValor().compareTo(n.getValor()) < 0) {
                maior = n;
            }
            n = n.getProximo();
        }
        return maior;
    }
}
