package grafos;

import java.lang.ArrayIndexOutOfBoundsException;
import static java.lang.Math.sqrt;

import java.lang.UnsupportedOperationException;

import java.lang.RuntimeException;
import java.util.ArrayList;

public class Grafo{
    
    private final int maxVertices;   
    private double matriz[][];
    private double densidad;
    private ArrayList<int[]> nodos = new ArrayList<int[]>(); 
    private ArrayList<int[]> aristas = new ArrayList<int[]>(); 
    
    public Grafo (int nVertices, double densidadGrafo){
        maxVertices = nVertices;
        matriz = new double[nVertices][nVertices];
        densidad = densidadGrafo * ((nVertices*(nVertices-1))/2);;
    }
    
    private int[] generarPosicion(){
        int [] pos  = new int[2];
        pos[0] = (int)(Math.random() * maxVertices) + 0; 
        pos[1]= (int)(Math.random() * maxVertices) + 0; 
        return pos;
    }
    private double generarAristas(int [] pos1, int[] pos2){
        int n = (int)(Math.random() * maxVertices) + 0; 
        if (n<densidad){
            return sqrt(Math.pow((pos1[0]-pos2[0]),2)+Math.pow((pos1[1]-pos2[1]),2));
        }
        return 0;
    }
    //Aca se crean los nodos y se carga altiro las aristas existente a la matriz, en caso de no existir se carga 0.
    public void inicializarMatriz(){
        for (int i = 0; i < maxVertices; i++) {
            int [] nod1 = generarPosicion();
            for (int j = 0; j < maxVertices; j++) {
                int [] nod2 = generarPosicion();
                nodos.add(nod2);
                matriz[i][j] =  generarAristas(nod1, nod2);
                if(matriz[i][j]!=0){
                    int [] arista = new int [2];
                    arista[0] = i;
                    arista[1] = j;
                    aristas.add(arista);
                }
            }
            nodos.add(nod1);
        }
    }
    
    public void mostrarNodos(){
        int i = 0;
        while(i<nodos.size()){
            int [] nodo1 = nodos.get(i);
            int [] nodo2 = nodos.get(i+1);
            System.out.println(nodo1[0]+"."+nodo1[1]+"  "+nodo2[0]+"."+nodo2[1]);
            i+=2;
        }
    }
    
    public void mostrarAristas(){
        for (int [] x: aristas) {
            System.out.println(x[0]+"  "+x[1]);
        }
    }
    
    public int cantidadVertices(){
        return nodos.size();
    }

    public int getMaxVertices() {
        return maxVertices;
    }


    public double[][] getMatriz() {
        return matriz;
    }

    public double getDensidad() {
        return densidad;
    }
}
