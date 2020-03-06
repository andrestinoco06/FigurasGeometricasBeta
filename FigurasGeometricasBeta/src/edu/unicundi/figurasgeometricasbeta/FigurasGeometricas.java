package edu.unicundi.figurasgeometricasbeta;

import java.util.List;

/**
 * Clase abstracta para almacenar atributos y metodos de las figuras geometricas implementando la interfaz IFiguraGeometrica.
 * @author Camilo Tinoco
 * @author Johan Zambrano
 * @version 1.0.0
 */
public abstract class FigurasGeometricas implements IFiguraGeometrica, IPintar{
    
    /**
     * Variable "lado1" para almacenar uno de los lados de la figura geométrica.
     */
    private double lado1;
    
    /**
     * Variable "area" para almacenar el area de la figura geométrica.
     */
    private double area;
    
    /**
     * Variable "perimetro" para almacenar el perimetro de la figura geométrica.
     */
    private double perimetro;
    
    /**
     * Array "coordenadas" para almacenar las coordenas de las figuras.
     */
    private int [] coordenadas;
    
    /**
     * Lista "figuras" de tipo FigurasGeometricas para almacenar las diferentes figuras geometricas.
     */
    private List<FigurasGeometricas> figuras;

    /**
     * Constructor FigurasGeometricas vacío.
     */
    public FigurasGeometricas(){
    }
    
    /**
     * Constructor FigurasGeometricas para agregar la figura.
     * @param figura 
     */
    public FigurasGeometricas(FigurasGeometricas figura){
        this.figuras.add(figura);
    }
    
    /**
     * Constructor FigurasGeometricas para hacer referencia a las coordenadas.
     * @param coordenadas 
     */
    public FigurasGeometricas (int [] coordenadas){
        this.coordenadas = coordenadas;
    }
    
    /**
     * Constructor FigurasGeometricas para resivir coordenadas y poder pintar la figura.
     * @param coordenadas
     * @param accion 
     */
    public FigurasGeometricas(int [] coordenadas, boolean accion){
        new Pintar(coordenadas);
    }
    
    /**
     * Constructor FigurasGeometricas para hacer referencia al lado1.
     * @param lado1 
     */
    public FigurasGeometricas (double lado1){
        this.lado1 = lado1;
    }
    
    /**
     * Método por el cual se van a imprimir el área y perimetro de las figuras.
     */
    public void imprimir(){
        System.out.println("Area: " + hallarArea() + " - Perimetro: " + hallarPerimetro());
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
    
    public int[] getCoordenadas() {
        return coordenadas;
    }

    public void setCoordenadas(int[] coordenadas) {
        this.coordenadas = coordenadas;
    }
    
    public List<FigurasGeometricas> getFiguras() {
        return figuras;
    }
    
    public void setFiguras(List<FigurasGeometricas> figuras) {
        this.figuras = figuras;
    }
}