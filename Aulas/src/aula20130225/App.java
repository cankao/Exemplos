/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aula20130225;

import javax.swing.JOptionPane;

public class App {

    public static void main(String[] args) {
        String numeroDeLinhasComoString = JOptionPane.showInputDialog("Digite o número de linhas");
        String numeroDeColunasComoString = JOptionPane.showInputDialog("Digite o número de colunas");
        
        int linhas = Integer.valueOf( numeroDeLinhasComoString );
        int colunas = Integer.valueOf( numeroDeColunasComoString );

        desenharMatriz(linhas, colunas);

    }

    private static void desenharMatriz(int numeroDeLinhas, int numeroDeColunas) {
        imprimirLinha("+", "-", numeroDeColunas);
        for (int i = 0; i < numeroDeLinhas; i++) {
            imprimirLinha("|", " ", numeroDeColunas);
            imprimirLinha("+", "-", numeroDeColunas);
        }
    }

    private static void imprimirLinha(String delimitador, String preenchimento, int numeroDeColunas) {
        for (int i = 0; i < numeroDeColunas; i++) {
            desenharLinhaDaColuna(delimitador, preenchimento, 4);
        }
        System.out.println(delimitador);
    }

    private static void desenharLinhaDaColuna(String delimitador, String preenchimento, int quantidadePreenchimento) {
        System.out.print(delimitador);
        for (int i = 0; i < quantidadePreenchimento; i++) {
            System.out.print(preenchimento);
        }
    }
}





