
package edu.unicundi.figurasgeometricasbeta;

/**
 * Clase triangulo, clase hija de la clase FigurasGeometricas
 * @author Camilo Tinoco
 * @author Johan Zambrano
 * @version  1.0.0
 */
public class Triangulo extends FigurasGeometricas{
    /**
     * Guarda el lado 2 del triangulo
     */
    private double lado2;
    
    /**
     * Guarda el lado 3 del triangulo
     */
    private double lado3;
    
    /**
     * Guarda el tipo del triangulo, puede ser: escaleno, isosceles, equilatero
     */
    private String tipo;
    /**
     * Guarda en un array de enteros las coordenadas
     */
    int[] coordenadas;
    
    /**
     * Constructor vacio, invoca el constructor vacio de la clase padre
     */
    public Triangulo(){
        super();
    }
    /**
     * Constructor que envia el lado 1 a la clase padre para guardarlo y realizar los procedimientos correspondientes
     * @param lado1, guarda el lado 1 del triangulo
     * @param lado2, guarda el lado 2 del triangulo
     * @param lado3, guarda el lado 3 del triangulo
     */
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
    /**
     * Constructor que enviar las coordenadas a la clase padre
     * @param coordenadas, recibe en un array de enteros las coordenadas de la figura
     */
    public Triangulo (int [] coordenadas){ 
        super(coordenadas);   
    }
   /**
    * Funcion que halla el perimetro
    * @return valor resultante del perimetro
    */
    @Override
    public double hallarPerimetro() {
        setPerimetro(getLado1() + lado2 + lado3);
        return getPerimetro();
    }
    /**
     * Función que halla el area
     * @retur el valor resultante del area
     */
    @Override
    public double hallarArea() {
        double per = hallarPerimetro()/2;        
        setArea((double) Math.sqrt(per*(per-getLado1())*(per-getLado2())*(per-lado3)));
        return getArea();
    }
    /**
     * Imprime los valores del triangulo
     */
    @Override
    public void imprimir(){
        System.out.println("Area: " + hallarArea()+ " - Perimetro: " + hallarPerimetro() + " Tipo: " + tipoTriangulo());
    }
    /**
     * Función que identifica el tipo del triangulo
     * @return 
     */
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
    /**
     * Funcion que valida que las coordenadas de la figura esten correctas
     * @param coordenadas, array de enteros con las coordenadas de la figura
     * @return true indica que la validación es correcta
     */
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
    /**
     * Funcion para pintar la figura geometrica
     * @param coordenadas, array de coordenadas para pintar la figura
     */
    @Override
    public void pintar(int[] coordenadas) {
        setLado1(Math.sqrt(Math.pow((coordenadas[2]) - (coordenadas[0]), 2) + Math.pow((coordenadas[3]) - (coordenadas[1]), 2))); 
        setLado2(Math.sqrt(Math.pow((coordenadas[4]) - (coordenadas[2]), 2) + Math.pow((coordenadas[5]) - (coordenadas[3]), 2)));
        setLado3(Math.sqrt(Math.pow((coordenadas[4]) - (coordenadas[0]), 2) + Math.pow((coordenadas[5]) - (coordenadas[1]), 2)));
        new Pintar(coordenadas);
    }
    
}
