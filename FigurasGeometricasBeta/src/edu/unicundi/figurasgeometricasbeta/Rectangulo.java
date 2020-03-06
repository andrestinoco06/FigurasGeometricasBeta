package edu.unicundi.figurasgeometricasbeta;

/**
 * Clase Rectangulo, clase hija de la clase FigurasGeometricas
 * @author Camilo Tinoco
 * @author Johan Zambrano
 * @version 1.0.0
 */
public class Rectangulo extends FigurasGeometricas{
    /**
     * Guarda el lado2 de la figura geometrica
     */
    private double lado2;
    /**
     * Guarda las coordenadas de la figura rectangulo, queda global para utilizarla en otras funciones de la misma clase
     */
    int[] coordenadas;
    /**
     * Construcutor vacio, invoca el constructor vacio de la clase padre
     */
    public Rectangulo(){
        super();
    }
    /**
     * Constructor para guardar los lados en la clase padre
     * @param lado1
     * @param lado2 
     */
    public Rectangulo (double lado1, double lado2){
        super(lado1);
        this.lado2 = lado2;
    }
    /**
     * Constructor que envia las coordenadas de la figura a la clase padre
     * @param coordenadas 
     */
    public Rectangulo (int [] coordenadas){ 
        super(coordenadas);   
    }
    /**
     * Halla el perimetro del rectangulo
     * @return valor del perimetro
     */
    @Override
    public double hallarPerimetro() {
        setPerimetro((getLado1() * 2) + (lado2 * 2));
        return getPerimetro();
    }
    /**
     * Halla el area del rectangulo
     * @return 
     */
    @Override
    public double hallarArea() {
        setArea(getLado1() * lado2);
        return getArea();
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }
    /**
     * Funcion que valida las coordenadas de la figura rectangulo
     * @param coordenadas, array de enteros que almacena las coordenadas
     * @return true indicando que la validacion es correcta
     */
    @Override
    public boolean validarFigura(int [] coordenadas) {
        boolean validacion = false;
        //valida que las coordenas sean correctas para un cuadrado
        if (coordenadas[1] == coordenadas[3]) {
            if (coordenadas[2] == coordenadas[4]) {
                if (coordenadas[5] == coordenadas[7]) {
                    if (coordenadas[6] == coordenadas[0]) {
                        validacion = true;
                    }
                }
            }
        }
        return validacion;
    }
    /**
     * Función para pintar la figura geometrica
     * @param coordenadas 
     */
    @Override
    public void pintar(int[] coordenadas) {
        setLado1(Math.sqrt(Math.pow((coordenadas[2]) - (coordenadas[0]), 2) + Math.pow((coordenadas[3]) - (coordenadas[1]), 2))); 
        setLado2(Math.sqrt(Math.pow((coordenadas[4]) - (coordenadas[2]), 2) + Math.pow((coordenadas[5]) - (coordenadas[3]), 2)));
        new Pintar(coordenadas);
    }

    
}
