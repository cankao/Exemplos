/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aula20130315.retangulos;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;

/**
 *
 * @author Cesumar
 */
public class RetanguloComponente extends JComponent {

    private Rectangle r = new Rectangle(5, 10, 15, 40);

    @Override
    protected void paintComponent(Graphics g) {         
        ((Graphics2D) g).draw(r);
        //super.paintComponent(g);
    }

    public void translate(int x, int y) {
        r.translate(x, y);
    }
}







