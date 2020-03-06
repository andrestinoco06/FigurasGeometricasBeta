package edu.unicundi.figurasgeometricasbeta;

/**
 * Clase cuadrado, es una clase hija de la Clase FigurasGeometricas
 * @author Camilo Tinoco
 * @author Johan Zambrano 
 * @version 1.0.0
 */
public class Cuadrado extends FigurasGeometricas{
    /**
    * Construcctor vacio
    */
    public Cuadrado(){
        super();
    }
    /**
    * Construcctor, recibe un lado y se invoca el constructor
    */
    public Cuadrado (double lado1){
        super(lado1);
    }
    /**
    * Construcctor que recibe un array de enteros con las coordenas de la figura 
    * y llama al constructor de la clase padre y de igual forma se las envia
    */
    
    public Cuadrado(int[] coordenadas) {
        super(coordenadas);
    }

    /**
    * Halla el area del cuadrado
    */
    
    @Override
    public double hallarArea() {
        setArea(getLado1() * getLado1());
        return getArea();
    }
    
    /**
    * Halla el perimetro del cuadrado
    */
    
    @Override
    public double hallarPerimetro() {
        setPerimetro(getLado1() * 4);
        return getPerimetro();
    }

    /**
     * Valida si las coordenadas del cuadrado son correctas 
     * @param coordenadas, recibe las coordenadas correspondientes
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
                        int lado1 = (coordenadas[0]-coordenadas[2])*-1; 
                        int lado2 = (coordenadas[3]-coordenadas[5])*-1; 
                        int lado3 = coordenadas[4]-coordenadas[6]; 
                        int lado4= coordenadas[7]-coordenadas[1]; 
                        if(lado1==lado2 && lado2==lado3 && lado3==lado4){
                            validacion = true;
                        }
                    }
                }
            }
        }
        return validacion;
    }
    /**
     * 
     * @param coordenadas, recibe las coordenadas del cuadrado para pintarlas
     */
    @Override
    public void pintar(int[] coordenadas) {
        setLado1(Math.sqrt(Math.pow((coordenadas[2]) - (coordenadas[0]), 2) + Math.pow((coordenadas[3]) - (coordenadas[1]), 2))); 
        new Pintar(coordenadas);
    }
/*
    @Override
    public void hallarLado(int[] coordenadas) {
        setLado1(Math.sqrt(Math.pow((coordenadas[2]) - (coordenadas[0]), 2) + Math.pow((coordenadas[3]) - (coordenadas[1]), 2))); 
    }
*/
}
