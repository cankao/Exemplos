/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aula20130315.retangulos;

import java.awt.Rectangle;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


/**
 *
 * @author Cesumar
 */
public class App {
    
    public static void main(String[] args) {
        JFrame frm1 = new JFrame();      
        frm1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm1.setSize(400,400);
        frm1.setTitle("Desenhando!! " + " XXX ");
        frm1.setVisible(true);       

        RetanguloComponente rc1 = new RetanguloComponente();
        
        frm1.add(rc1);
        JOptionPane.showMessageDialog(null, "Wait!");        
        frm1.setVisible(false);
        rc1.translate(30, 30);
        frm1.setVisible(true);
        
        
    }
    
}
