
package edu.unicundi.figurasgeometricasbeta;

/**
 *
 * @author Camilo Tinoco
 * @author Johan Zambrano
 * @version  1.0.0
 */
public class Triangulo extends FigurasGeometricas{
    
    private double lado2;
    
    private double lado3;
    
    private String tipo;
    
    int[] coordenadas;
    
    public Triangulo(){
        super();
    }

    public Triangulo (double lado1, double lado2, double lado3){
        super(lado1);
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public Triangulo (int [] coordenadas){ 
        super(coordenadas);   
    }
    
    public Triangulo(int[] coordenadas, boolean accion) {
        super(coordenadas,true);
    }

    @Override
    public double hallarPerimetro() {
        setPerimetro(getLado1() + lado2 + lado3);
        return getPerimetro();
    }

    @Override
    public double hallarArea() {
        double per = hallarPerimetro()/2;        
        setArea((double) Math.sqrt(per*(per-getLado1())*(per-getLado2())*(per-lado3)));
        return getArea();
    }
    
    @Override
    public void imprimir(){
        System.out.println("Area: " + hallarArea()+ " - Perimetro: " + hallarPerimetro() + " Tipo: " + tipoTriangulo());
    }
    
    public String tipoTriangulo(){
        if((getLado1() == lado2) & (getLado1() == lado3) & (lado2 == lado3)){
            tipo = "Es un triangulo equilatero";
        }
        else if ((getLado1() != lado2) & (getLado1() != lado3) & (lado2 != lado3)){
            tipo = "Es un triangulo escaleno";
        }
        else {
            tipo = "Es un triangulo isosceles";
        }
        return tipo;
    }

    @Override
    public boolean validarFigura(int [] coordenadas) {
                boolean validacion = true;
        //valida que las coordenas sean correctas para un cuadrado
        if (coordenadas[0] == coordenadas[2] && coordenadas[1] == coordenadas[3]) {
            validacion=false;
        }
        if (coordenadas[0] == coordenadas[4] && coordenadas[1] == coordenadas[5]) {
            validacion = false;
        }        
        if (coordenadas[2] == coordenadas[4] && coordenadas[3] == coordenadas[5]) {
            validacion = false;
        }        
        if(validacion==false){
            System.out.println("------------- No se puede pintar porque las coordenadas no son correctas --------- ");
        }
        return validacion;

    }

    @Override
    public void pintar(int[] coordenadas) {
        setLado1(Math.sqrt(Math.pow((coordenadas[2]) - (coordenadas[0]), 2) + Math.pow((coordenadas[3]) - (coordenadas[1]), 2))); 
        setLado2(Math.sqrt(Math.pow((coordenadas[4]) - (coordenadas[2]), 2) + Math.pow((coordenadas[5]) - (coordenadas[3]), 2)));
        setLado3(Math.sqrt(Math.pow((coordenadas[4]) - (coordenadas[0]), 2) + Math.pow((coordenadas[5]) - (coordenadas[1]), 2)));
        new Pintar(coordenadas);
    }
    
}
