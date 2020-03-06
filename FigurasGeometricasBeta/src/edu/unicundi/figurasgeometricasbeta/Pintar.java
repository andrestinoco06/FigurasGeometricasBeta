/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicundi.figurasgeometricasbeta;

import javax.swing.BoxLayout;

/**
 *
 * @author Camilo Tinoco
 * @author Johan Zambrano
 */
public class Pintar extends javax.swing.JFrame{
    
    //Este JFRAME, para pintar siempre se llama a este, y este llama al JPanel
    public Pintar(int[] coordenadas){
        super("Pintar");
        this.setSize(415,440); //tamaño
        this.setLocationRelativeTo(null);
        getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.LINE_AXIS));//para que se pueda agrandar o achicar el JFrame
        PlanoCartesiano a = new PlanoCartesiano(coordenadas);
        this.add(a);
        setVisible(true);
    }
}

