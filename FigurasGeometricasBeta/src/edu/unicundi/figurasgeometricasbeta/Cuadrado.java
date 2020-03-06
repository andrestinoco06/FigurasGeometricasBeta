package edu.unicundi.figurasgeometricasbeta;

/**
 *
 * @author Camilo Tinoco
 * @author Johan Zambrano 
 * @version 1.0.0
 */
public class Cuadrado extends FigurasGeometricas{

    int[] coordenadas;
    
    public Cuadrado(){
        super();
    }
    
    public Cuadrado (double lado1){
        super(lado1);
    }

    public Cuadrado(int[] coordenadas) {
        super(coordenadas);
    }
    
    public Cuadrado(int[] coordenadas, boolean accion) {
        super(coordenadas,true);
    }
    
    @Override
    public double hallarArea() {
        setArea(getLado1() * getLado1());
        return getArea();
    }
    
    @Override
    public double hallarPerimetro() {
        setPerimetro(getLado1() * 4);
        return getPerimetro();
    }

    @Override
    public boolean validarFigura() {
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
