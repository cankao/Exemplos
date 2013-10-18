/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aula20130408.exercicioComClasses;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;

/**
 *
 * @author Cesumar
 */
public class Pincel extends JComponent {
    private Corpo corpo;
    private Tampa tampa;
    
    public Pincel(Color cor, double percentualDeCarga) {                
        this.corpo = new Corpo(cor, percentualDeCarga);
        this.tampa = new Tampa();
    }
    
    public void setCarga(double novaCarga) {
        this.corpo.setCarga(novaCarga);
        this.repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        corpo.paintComponents(g);
        tampa.paintComponents(g);
    }
    
    

    
    
    
}
