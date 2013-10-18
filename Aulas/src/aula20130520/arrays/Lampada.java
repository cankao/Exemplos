package aula20130520.arrays;

public class Lampada {
    private boolean acesa = false;
    
    
    public Lampada() {
        this.acesa = true;
    }
    
    public void desligar() {
        this.acesa = false;
    }

    public boolean isAcesa() {
        return acesa;
    }
    
    
    
}
