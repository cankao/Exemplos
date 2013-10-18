/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aula20130322.elementosGraficos;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;

/**
 *
 * @author Cesumar
 */
public class NossoRetanguloComponente extends JComponent {
    private int _x;
    private int _y;
    private int _width;
    private int _height;

    public NossoRetanguloComponente(int x, int y, int width, int height) {
        _x = x;
        _y = y;
        _width = width;
        _height = height;
                
    }
    
    @Override
    protected void paintComponent(Graphics g) {        
        Graphics2D g2 = (Graphics2D) g;
        //Rectangle r1 = new Rectangle(5,5,15,25);
        Rectangle r1 = new Rectangle(_x,_y,_width,_height);
        g2.draw(r1);                
    }

    
    
}










