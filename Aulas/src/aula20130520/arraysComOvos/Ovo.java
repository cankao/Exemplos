package aula20130520.arraysComOvos;

public class Ovo {
    private boolean inteiro = false;
    
    public Ovo() {
        inteiro = true;
    }
    
    public void quebrar() {
        inteiro = false;
    }

    @Override
    public String toString() {
        return hashCode() + ", inteiro? (" + inteiro + ")";
    }
    
    
}
