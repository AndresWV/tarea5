/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafos;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author waiv
 */
public class Grafos {

    /**
     * @param args the command line arguments
     */
     
    static File f = new File("grafos.txt");
    static ArrayList<int[]> posicionesVertices = new ArrayList<int[]>();
    static ArrayList<int[]> aristasVertices = new ArrayList<int[]>();
    static int n;
    static int m;
    
    
    public static void extraerDatos(){
        
        try(Scanner entrada = new Scanner(f)){
            
            n = Integer.parseInt(entrada.next());
            
           
            for (int i = 0; i < 2*n; i++) {   
                String numero = entrada.next();
                int [] pos = new int [2]; 
                pos[0] = Character.getNumericValue(numero.charAt(0));
                pos[1] = Character.getNumericValue(numero.charAt(2));
                posicionesVertices.add(pos);
            }
            m = Integer.parseInt(entrada.next());
            for (int i = 0; i < m; i++) {
                int [] pos = new int [2]; 
                pos[0] = Integer.parseInt(entrada.next());
                pos[1] = Integer.parseInt(entrada.next());
                aristasVertices.add(pos);
            }
            
        }
        catch(Exception e){
            System.out.println(e.getCause());
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        extraerDatos();
        
    }
    
}
