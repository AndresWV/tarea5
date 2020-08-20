package grafos;


public class dijkstra{

    public void iniciarDijkstra(Grafo grafo, int nodoInicio){
        int n = grafo.cantidadVertices();
        boolean[] R = new boolean[n];
        int[] sp = new int[n];
        int[] from = new int[n];

        for (int i = 0; i < n-1; i++) {
            R[i] = false;
            sp[i] = Integer.MAX_VALUE;
            from[i] = -1;
        }
        sp[nodoInicio] = 0;

        for (int i = 0; i < n-1; i++) {
            int u2 = distanciaMinima(sp, R, n);
            R[u2] = true;

            for (int j = 0; j < n; j++) {
                if (!R[j] && grafo.getMatriz()[u2][j] != 0 &&
                        sp[u2] != Integer.MAX_VALUE && sp[u2] + grafo.getMatriz()[u2][j] < sp[j]) {
                    sp[j] = sp[u2] + grafo.getMatriz()[u2][j];
                }
            }
        }
        for (int i = 0; i < n; i++){
            System.out.println(i + " sp: " + sp[i]);
        }

    }

    int distanciaMinima(int[] sp, boolean[] sptSet, int n)
    {
        int min = Integer.MAX_VALUE, min_index = -1;

        for (int v = 0; v < n; v++)
            if (!sptSet[v] && sp[v] <= min) {
                min = sp[v];
                min_index = v;
            }

        return min_index;
    }
}