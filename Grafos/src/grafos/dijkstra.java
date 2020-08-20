package grafos;


import java.util.ArrayList;

public class Dijkstra {

    public void iniciarDijkstra(Grafo grafo, int nodoInicio){
        int n = grafo.getMaxVertices();
        boolean[] R = new boolean[n];
        double[] sp = new double[n];
        int[] from = new int[n];

        for (int i = 0; i < n; i++) {
            R[i] = false;
            sp[i] = Integer.MAX_VALUE;
            from[i] = -1;
        }
        sp[nodoInicio] = 0;

        for (int i = 0; i < n; i++) {
            int u2 = distanciaMinima(sp, R, n);
            R[u2] = true;

            for (int j = 0; j < n; j++) {
                if (!R[j] && grafo.getMatriz()[u2][j] != 0 &&
                        sp[u2] != Integer.MAX_VALUE && sp[u2] + grafo.getMatriz()[u2][j] < sp[j]) {
                    sp[j] = sp[u2] + grafo.getMatriz()[u2][j];
                    from[j] = u2;
                }
            }
        }
        for (int i = 0; i < n; i++){
            System.out.println(i + " sp: " + sp[i]+ " from: "+ from[i]);
        }
    }

    int distanciaMinima(double[] sp, boolean[] sptSet, int n)
    {
        double min = Integer.MAX_VALUE;
        int min_index = -1;

        for (int v = 0; v < n; v++)
            if (!sptSet[v] && sp[v] <= min) {
                min = sp[v];
                min_index = v;
            }
        System.out.println("Min index: " +min_index);
        return min_index;
    }
}