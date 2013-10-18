package aula20130621.filas.comArrayList;

import java.util.ArrayList;
import java.util.Stack;

public class Fila {

    private ArrayList<String> valores = null;

    public Fila(Fila primeira, Fila segunda) {
        this(primeira.getTamanho() + segunda.getTamanho());
        this.moverElementos(primeira);
        this.moverElementos(segunda);
    }

    public Fila() {
        this(100);
    }

    public Fila(int tamanhoMaximo) {
        this.valores = new ArrayList<String>(tamanhoMaximo);
    }

    public void enfileirar(String valor) {
        valores.add(valor);
    }

    public String recuperarProximo() {
        if (estiverVazia()) {
            return null;
        }        
        return valores.remove(0);
    }

    public int getTamanho() {
        return valores.size();
    }

    public boolean naoEstiverVazia() {
        return !estiverVazia();
    }

    public boolean estiverVazia() {
        return valores.isEmpty();
    }

    public Fila concatenar(Fila outra) {
        return new Fila(this, outra);
    }

    private void moverElementos(Fila origem) {
        while (origem.naoEstiverVazia()) {
            this.enfileirar(origem.recuperarProximo());
        }
    }

    public Fila[] racharEmFilasCom(int elementosPorFila) {

        int quantasFilas = calcularQuantaFilasSeraoCriadas(elementosPorFila);

        Fila[] filasResultantes = new Fila[quantasFilas];
        for (int fila = 0; fila < quantasFilas; fila++) {
            filasResultantes[fila] = new Fila();
            for (int i = 0; i < elementosPorFila; i++) {
                if (this.naoEstiverVazia()) {
                    filasResultantes[fila].enfileirar(this.recuperarProximo());
                }
            }
        }


        return filasResultantes;
    }

    private int calcularQuantaFilasSeraoCriadas(int elementosPorFila) {
        int quantasFilas = this.getTamanho() / elementosPorFila;
        if (this.getTamanho() - (elementosPorFila * quantasFilas) > 0) {
            quantasFilas++;
        }
        return quantasFilas;
    }
}
