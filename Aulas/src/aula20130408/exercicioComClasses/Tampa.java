/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aula20130408.exercicioComClasses;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;

/**
 *
 * @author Cesumar
 */
public class Tampa extends JComponent{
    
    @Override
    public void paintComponents(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        Rectangle r = new Rectangle(255,55,80,45);        
        g2.setColor(Color.WHITE);
        g2.fill(r);
        g2.setColor(Color.GRAY);
        g2.draw(r);
    }
    
    
}
