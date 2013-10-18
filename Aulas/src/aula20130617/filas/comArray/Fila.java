package aula20130617.filas.comArray;

public class Fila {

    private int tamanho = 0;
    private String[] valores = null;

    public Fila(Fila primeira, Fila segunda) {
        this(primeira.getTamanho() + segunda.getTamanho());
        this.moverElementos(primeira);
        this.moverElementos(segunda);
    }

    public Fila() {
        this(100);
    }

    public Fila(int tamanhoMaximo) {
        this.valores = new String[tamanhoMaximo];
    }

    public void enfileirar(String valor) {
        if (tamanho >= valores.length) {
            throw new RuntimeException("Não é possível armazenar mais do que " + valores.length + " itens nesta fila!");
        }
        valores[tamanho] = valor;
        tamanho++;
    }

    public String recuperarProximo() {
        if (estiverVazia()) {
            return null;
        }
        String proximo = valores[0];
        for (int i = 1; i < tamanho; i++) {
            valores[i - 1] = valores[i];
        }
        valores[tamanho - 1] = null;
        tamanho--;
        return proximo;
    }

    public int getTamanho() {
        return tamanho;
    }

    public boolean naoEstiverVazia() {
        return !estiverVazia();
    }

    public boolean estiverVazia() {
        return this.tamanho == 0;
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
    
    
   public boolean equals(Fila fila) {
	   return this.getTamanho() == fila.getTamanho();
	   
   }
    
}
