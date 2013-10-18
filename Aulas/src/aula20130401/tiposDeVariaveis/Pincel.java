/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aula20130401.tiposDeVariaveis;

import java.awt.Color;

/**
 *
 * @author Cesumar
 */
public class Pincel {
    private Color cor;
    private double capacidadeDeTinta;
    private double carga;

    public Pincel(Color cor, double carga, double capacidadeDeTinta) {
        this.cor = cor;
        this.carga = carga;
        this.capacidadeDeTinta = capacidadeDeTinta;
    }
    public void carregar(Color cor, double volumeDeTinta) {
        if (this.cor != cor) {
            throw new RuntimeException("A cor não pode ser diferente, esperava " + this.cor + " mas recebi " + cor);
        }
        if (volumeDeTinta < 0) {
            throw new RuntimeException("Não é permitido volume negativo!");
        }
        double auxiliar = this.carga + volumeDeTinta;
        if (this.capacidadeDeTinta < auxiliar) {
            throw new RuntimeException("Não é permitido exceder a capacidade total do pincel.");
        }
        
    }
    
    
    
    
    
}
