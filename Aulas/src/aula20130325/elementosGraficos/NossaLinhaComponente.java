/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aula20130325.elementosGraficos;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import javax.swing.JComponent;

/**
 *
 * @author Cesumar
 */
public class NossaLinhaComponente extends JComponent {
    private double x1, x2, y1, y2;

    public NossaLinhaComponente(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
        
    }

    @Override
    protected void paintComponent(Graphics g) {
        Line2D line = new Line2D.Double(x1,y1,x2,y2);
        Graphics2D g2 = (Graphics2D) g;
        g2.draw(line);
    }
}
