/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aula20130325.elementosGraficos;

import java.awt.BorderLayout;
import java.awt.Rectangle;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.OverlayLayout;

/**
 *
 * @author Cesumar
 */
public class FrmPrincipal extends JFrame {

    public FrmPrincipal() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 400);
        this.setTitle("FrmPrincipal v0.01");
        
        this.setLayout(new OverlayLayout(this.getContentPane()));
        this.add( new NossoRetanguloComponente(5,5,15,25));
        this.add( new NossoRetanguloComponente(15,15,15,25));
        this.add( new NossoRetanguloComponente(25,25,15,25));
        this.add( new NossaLinhaComponente(50.0,50.0,75.0,75.0) );
        this.add( new NossaLinhaComponente(70.0,70.0,85.0,95.0) );
        
    }
    
    public static void main(String[] args) {
        FrmPrincipal frm1 = new FrmPrincipal();
        frm1.setVisible(true);
    }
    
}
