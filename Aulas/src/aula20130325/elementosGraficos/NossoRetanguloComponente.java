/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aula20130325.elementosGraficos;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;

/**
 * Classe criada para permitir o desenho de figuras retangulares em 
 * formulários que utilizem JComponent.
 * 
 * @author Cesumar
 */
public class NossoRetanguloComponente extends JComponent {
    private int x;
    private int y;
    private int width;
    private int height;


    /**
     * Construtor da classe que recebe o ponto superior esquerdo, a altura e largura 
     * para desenhar o retângulo
     * @param x Coordenada x do ponto inicial
     * @param y Coordenada y do ponto inicial
     * @param width Largura do retângulo
     * @param height Algura do retângulo
     */
    public NossoRetanguloComponente(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    
    @Override
    protected void paintComponent(Graphics g) {        
        Graphics2D g2 = (Graphics2D) g;
        //Rectangle r1 = new Rectangle(5,5,15,25);
        Rectangle r1 = new Rectangle(x,y,width,height);
        g2.setBackground(Color.GREEN);
        g2.fill(r1);
        g2.setColor(Color.PINK);
        g2.draw(r1);                
    }

    
    
}










