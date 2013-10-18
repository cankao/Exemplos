/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aula20130408.exercicioComClasses;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;
import javax.swing.JComponent;

/**
 *
 * @author Cesumar
 */
public class Corpo extends JComponent {

    private Color cor;
    private double percentualDeCarga;

    public Corpo(Color cor, double percentualDeCarga) {
        this.cor = cor;
        this.percentualDeCarga = percentualDeCarga;
    }

    @Override
    public void paintComponents(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        Rectangle r = new Rectangle(55, 55, 200, 45);
        //g2.setColor(Color.PINK);
        g2.setColor(this.cor);
        g2.fill(r);
        g2.setColor(Color.GRAY);
        g2.draw(r);
        
        representarCarga(r, g2);

    }

    private void representarCarga(Rectangle r, Graphics2D g2) {
        if (this.percentualDeCarga < 1) {
            int x = (int)r.getX();
            int largura = 200-(int)(r.getWidth() * this.percentualDeCarga);
            
            Rectangle espacoLivre = new Rectangle(x, (int)r.getY(), largura, (int)r.getHeight());
            g2.setColor(Color.GRAY);
            g2.fill(espacoLivre);
        }
    }

    public void setCarga(double novaCarga) {
        this.percentualDeCarga = novaCarga;
    }
}
