package edu.unicundi.figurasgeometricasbeta;

import java.awt.Color;
import java.awt.Graphics;

/**
 * Clase para pintar la figura geometrica.
 * @author Camilo Tinoco
 * @author Johan Zambrano
 * @version 1.0.0
 */
public class PlanoCartesiano  extends javax.swing.JPanel{
    
    /**
     * Array "coordenas" para almacenar las coordenadas de la figura geometrica.
     */
    int[] coordenas;
    
    /**
     * Constructor para inicializar el array.
     * @param coordenadas 
     */
    public PlanoCartesiano(int[] coordenadas){
        this.coordenas = coordenadas;
        setBackground(Color.black);
    }
    
    /**
     * Método para pintar línea por línea en el plano cartesiano.
     * @param g 
     */
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);        
        g.drawLine(coordenas[0]*30, coordenas[1]*30,coordenas[2]*30, coordenas[3]*30);
        g.drawLine(coordenas[2]*30, coordenas[3]*30,coordenas[4]*30, coordenas[5]*30);
        g.drawLine(coordenas[4]*30, coordenas[5]*30,coordenas[6]*30, coordenas[7]*30);
        g.drawLine(coordenas[6]*30, coordenas[7]*30,coordenas[0]*30, coordenas[1]*30);    
        g.setColor(Color.red);
    }
}
