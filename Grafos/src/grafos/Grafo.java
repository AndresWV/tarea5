package grafos;

import java.lang.ArrayIndexOutOfBoundsException;
import static java.lang.Math.sqrt;

import java.lang.UnsupportedOperationException;

import java.lang.RuntimeException;
import java.util.ArrayList;

public class Grafo{
    
    private final int maxVertices;
    private final int maxAristas;   
    private int matriz[][];
    private double densidad;
    
    public Grafo (int nVertices, int nAristas, double densidadGrafo){
        maxAristas = nAristas;
        maxVertices = nVertices;
        matriz = new int[nVertices][nVertices];
        densidad = densidadGrafo * ((nVertices*(nVertices-1))/2);;
    }
    
    public void inicializarMatriz(){
        int x = (int)(Math.random() * maxVertices) + 0; 
        int y = (int)(Math.random() * maxVertices) + 0; 
        int x2 = (int)(Math.random() * maxVertices) + 0; 
        int y2 = (int)(Math.random() * maxVertices) + 0; 
        double d = sqrt(Math.pow((x-x2),2) + Math.pow((y-y2),2));
    }
    
    
    
    

}
