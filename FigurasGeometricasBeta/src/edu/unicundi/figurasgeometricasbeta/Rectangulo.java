package edu.unicundi.figurasgeometricasbeta;

/**
 *
 * @author Camilo Tinoco
 * @author Johan Zambrano
 * @version 1.0.0
 */
public class Rectangulo extends FigurasGeometricas{

    private double lado2;
    int[] coordenadas;
    
    public Rectangulo(){
        super();
    }
    
    public Rectangulo (double lado1, double lado2){
        super(lado1);
        this.lado2 = lado2;
    }
    
    public Rectangulo (int [] coordenadas){ 
        super(coordenadas);   
    }
    
    public Rectangulo(int[] coordenadas, boolean accion) {
        super(coordenadas,true);
    }

    @Override
    public double hallarPerimetro() {
        setPerimetro((getLado1() * 2) + (lado2 * 2));
        return getPerimetro();
    }

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

    @Override
    public void pintar(int[] coordenadas) {
        setLado1(Math.sqrt(Math.pow((coordenadas[2]) - (coordenadas[0]), 2) + Math.pow((coordenadas[3]) - (coordenadas[1]), 2))); 
        setLado2(Math.sqrt(Math.pow((coordenadas[4]) - (coordenadas[2]), 2) + Math.pow((coordenadas[5]) - (coordenadas[3]), 2)));
        new Pintar(coordenadas);
    }

    
}
