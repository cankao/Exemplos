package aula20130603.filaComArrayList;

import java.util.ArrayList;

public class Fila {
    ArrayList<String> valores = new ArrayList<String>();
    
    public void enfileirar(String s) {
        valores.add(s);
    }
    public String recuperarProximo() {
        if (valores.isEmpty()) {
            throw new RuntimeException("A fila está vazia!");
        }
        return valores.remove(0);
    }
    
}
