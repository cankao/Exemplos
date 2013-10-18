/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aula20130315.desenhosGraficos;

import java.awt.Rectangle;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Cesumar
 */
public class App {
    //psvm <tab> ==> criar o método main
    //sout <tab> ==> System.out.println("");
    
    public static void main(String[] args) {
        //JOptionPane.showMessageDialog(null, "Oi!");
        //JOptionPane.showConfirmDialog(null, "Deseja excluir?");
        Rectangle r1 = new Rectangle(10,10,30,45);
        
        JFrame frm1 = new JFrame();
        frm1.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        frm1.setSize(400, 400);
        frm1.setTitle("Primeiro dialog v0.27");
        frm1.setVisible(true);
        
        JOptionPane.showMessageDialog(null, "1");
        frm1.setVisible(false);
        
        JOptionPane.showMessageDialog(null, "2");
        frm1.setVisible(true);        
        
        System.out.println("Pronto.");
    }
    
}












