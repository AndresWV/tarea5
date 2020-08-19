/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafos;

/**
 *
 * @author waiv
 */
public class Grafos {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Grafo grafo = new Grafo(3, 1.0);
        grafo.inicializarMatriz();
        grafo.mostrarNodos();
        grafo.mostrarAristas();
    }
    
}
