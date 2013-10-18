package aula20130506.fracoes;

public class NumeroFracionario {
    private int numerador;
    private int denominador;
    
    public NumeroFracionario(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }
    public NumeroFracionario somar(NumeroFracionario outro) {
        if (this.denominador != outro.denominador) {
            throw new RuntimeException("O denominador deve ser igual!!");
        }        
        return new NumeroFracionario(this.numerador+outro.numerador, this.denominador);
    }
    public String toString() {
        return this.numerador + "/" + this.denominador;
    }
}
