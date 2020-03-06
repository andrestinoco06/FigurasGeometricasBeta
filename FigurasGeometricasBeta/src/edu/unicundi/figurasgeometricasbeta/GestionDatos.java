/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicundi.figurasgeometricasbeta;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Clase principal del proyecto, tiene incluido el menu del usuario y gestiona todos los datos del programa
 * @author Camilo Tinoco
 * @author Johan Zambrano
 * @version 1.0.0
 */
public class GestionDatos{
    /**
     * Guarda las figuras ingresadas
     */
    List<FigurasGeometricas> lista = new ArrayList<>();
    
    /**
     * Constructor principal que ejectua el programa
     */
    
    public GestionDatos(){
        main();
    }
    
    /**
     * Función que ejecutra el menú principal
     */
    public void main(){
        byte opcion, desea;
        
        Scanner leer = new Scanner(System.in);
        
        do{
            System.out.println("-- Menu --");
            System.out.println("1. Agregar figura");
            System.out.println("2. Ver figura");
            opcion = (byte) leer.nextInt();
            switch(opcion){
                case 1:
                    ingresarFigura();
                    break;
                case 2:
                    mostrarFigura();
                    break;
                default:
                    System.out.println("Esta opción no es válida");
            }
            System.out.println("¿Terminar programa? \n1-Si\n2-No");
            desea = (byte) leer.nextInt();
        } while (desea == 2);
    }
    /**
     * Funcion que muestra las figuras que estan guardadas
     */
    public void mostrarFigura(){
        for(int i=0; i<lista.size();i++){
            if(lista.get(i) instanceof Cuadrado){
                System.out.println((i+1) + " Cuadrado.");
            }else{
                if(lista.get(i) instanceof Triangulo){
                    System.out.println((i+1) + " Triangulo.");
                }else{
                    System.out.println((i+1) + " Rectangulo.");
                }
            }
        }
        Scanner leer = new Scanner(System.in);
        FigurasGeometricas figura;
        byte opcion;
        System.out.println("Ingrese la opcion que quiere ver: ");
        opcion = (byte) leer.nextInt();
        if(lista.get(opcion-1) instanceof Cuadrado){
            figura = new Cuadrado();
            if(figura.validarFigura(lista.get(opcion-1).getCoordenadas())){
                figura.pintar(lista.get(opcion-1).getCoordenadas());
                figura.imprimir();
            }
        }
        else if(lista.get(opcion-1) instanceof Rectangulo){
            figura = new Rectangulo();
            if(figura.validarFigura(lista.get(opcion-1).getCoordenadas())){
                figura.pintar(lista.get(opcion-1).getCoordenadas());
                figura.imprimir();
            }            
        }
        else {
            figura = new Triangulo();
            if(figura.validarFigura(lista.get(opcion-1).getCoordenadas())){
                figura.pintar(lista.get(opcion-1).getCoordenadas());
                figura.imprimir();
            }            
        }
    }
    
    /**
     * Funcion para agregar las figuras
     */
    public void ingresarFigura(){
        
        byte opcion, agregar;
        
        Scanner leer = new Scanner(System.in);
                    
        FigurasGeometricas figura;
        
            do {
                System.out.println("-- Menu --");
                System.out.println("1. Cuadrado");
                System.out.println("2. Rectangulo");
                System.out.println("3. Triangulo");
                opcion = (byte) leer.nextInt();
            } while (opcion > 3 || opcion < 1);

            switch (opcion) {
                case 1:
                    int[] arrayCoordenadasC = coordenadas(1);
                    figura = new Cuadrado(arrayCoordenadasC);
                    lista.add(figura);                    
                break;
                case 2:
                    int[] arrayCoordenadasR = coordenadas(2);
                    figura = new Rectangulo(arrayCoordenadasR);
                    lista.add(figura);                    
                break;
                case 3:
                    int[] arrayCoordenadasT = coordenadas(3);
                    figura = new Triangulo(arrayCoordenadasT);
                    lista.add(figura);                    
                break;
            }

    }
    /**
     * Funcion que guarda las coordenadas de la figura correspondiente
     * @param tipo, 1 es cuadrado, 2 rectangulo, 3 triangulo
     * @return Array de enteros que contiene las coordenadas de la figura
     */
    public int[] coordenadas(int tipo) {
        
        int[] coordenadas = new int[8];
        
        Scanner leer = new Scanner(System.in);

        for (int i = 0; i < 8; i++) {
            if (i % 2 == 0) {
                System.out.println("Ingrese la coordenada " + (i + 1) + " en X => ");
                coordenadas[i] = leer.nextInt();
            } else {
                System.out.println("Ingrese la coordenada " + (i) + " en Y => ");
                coordenadas[i] = leer.nextInt();
            }
            if(tipo==3 && i==5){
                coordenadas[i+1] = coordenadas[i-1];
                coordenadas[i+2] = coordenadas[i];
                i=9;
            }
        }
        
        for (int i = 0; i < 8; i++) {
            if (i % 2 == 0) {
                System.out.println("Coordenada " + (i + 1) + " en X => " + coordenadas[i]);
            } else {
                System.out.println("Coordenada " + (i) + " en Y => " + coordenadas[i]);
            }
        }
        
        System.out.println("Datos almacenados");
        
        return coordenadas;
    }
}