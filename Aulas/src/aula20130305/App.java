/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aula20130305;

import java.io.PrintStream;

/**
 *
 * @author Cesumar
 */
public class App {
    
    public static void main(String[] args) {
        //variaveisValorePrimitivosEReferencias();
        //chamadasDeMetodosEmStrings();
        int tamanho1 = "string qualquer".length();
        int tamanho2 = "xxx".length();
        
        String pais = "Brasil".replace('s', 'z');
        System.out.println("Pais após o replace: " + pais);
                
        PrintStream meuStream = null;
        meuStream = System.out;
        
        System.out.println(meuStream);
        System.out.println(System.out);
        
        int valor1 = 17;
        int valor2 = valor1;
        
        meuStream.println("Imprimindo usando a referência meuStream...");
        
        //Não pode, tipos incompatíveis!
        //meuStream = 17;
        
        Integer v1 = new Integer(15);
        Integer v2 = v1;
        v1 = new Integer(25);
        System.out.println(v1 + " e " + v2);
        
        Pessoa fulano = new Pessoa("José");        
        System.out.println("Nome = " + fulano.getNome());
        fulano = fulano.mudaNome("Josias");
        System.out.println("Nome = " + fulano.getNome());
         
        
    }

    private static void chamadasDeMetodosEmStrings() {
        String pais = "Brasil";
        System.out.println("O nome do país é ["+ pais +"]");
        String paisEmMaiusculas = pais.toUpperCase();
        System.out.println("O nome do país é ["+ pais +"]");
        System.out.println("O nome do país é ["+ paisEmMaiusculas +"]");
        System.out.println("O nome do país é ["+ pais.toUpperCase() +"]");
        System.out.println("O valor da soma é = " + ((1+2+3)/(3-9)));
        System.out.println((((("xx")))) + ("xxx"));
        double valor = 1/3d;
        System.out.println(valor);
    }

    private static void variaveisValorePrimitivosEReferencias() {
        String nome = "Fulano";
        System.out.println("O tamanho do nome é=" + nome.length());
        System.out.println("O tamanho do nome literal é=" + "Fulano".length());
        int valor = 100;        
        
        int valorInt; //Integer
        double valorDouble; //Double
        char valorChar; //Character
        boolean valorBoolean; //Boolean
        long valorLong; //Long
        float valorFloat; //Float
        short valorShort; //Short 
        byte valorByte; //Byte
        Byte referenciaByte;
    }
    
}
