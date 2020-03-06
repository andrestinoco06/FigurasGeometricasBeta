package edu.unicundi.figurasgeometricasbeta;

import java.util.List;

/**
 * Interfaz para almacenar los métodos de la clase abstracta.
 * @author Camilo Tinoco
 * @author Johan Zambrano
 * @version 1.0.0
 */
public interface IFiguraGeometrica {
    
    /**
     * Método para hallar el área de las figuras geometricas.
     * @return double
     */
    public double hallarArea();
    
    /**
     * Método para hallar el perimetro de las figuras geometricas.
     * @return double
     */
    public double hallarPerimetro();
    
    /**
     * Método para validar si las coordenadas ingresadas pertenecen a una figura geometrica.
     * @return boolean
     */
    public boolean validarFigura(int [] coordenadas);
    
    //public void hallarLado(int [] coordenadas);
}