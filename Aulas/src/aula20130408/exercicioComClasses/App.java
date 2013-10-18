/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aula20130408.exercicioComClasses;

import java.awt.Color;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author Cesumar
 */
public class App extends JDialog {

    public static void main(String[] args) {
        App app = new App();
        app.setSize(600, 400);
        app.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        double cargaInicial = 0.90;


        Pincel pincelPretoPelaMetade = new Pincel(Color.BLUE, cargaInicial);        
        app.add(pincelPretoPelaMetade);
        app.setVisible(true);

        for (int i = 0; i < 6; i++) {
            JOptionPane.showMessageDialog(null, "Vamos reduzindo a carga...");
            cargaInicial-=0.15;
            pincelPretoPelaMetade.setCarga(cargaInicial);
        }


    }
}
