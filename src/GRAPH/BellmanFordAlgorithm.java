package GRAPH;


import java.util.*;

public class BellmanFordAlgorithm {

    static int[] bellman_ford(int V, ArrayList<ArrayList<Integer>>  list,int source){

        //create the distance array
        int[] distanceArray = new int[V];

        for(int i = 0; i < V; i++)
            distanceArray[i] = (int)(1e9);

        distanceArray[source] = 0;

        // relaxation for n - 1 iteration
        for (int i = 0; i < V - 1; i++) {
            for(ArrayList<Integer> it : list){
                int u = it.get(0);
                int v = it.get(1);
                int weight = it.get(2);

                //dist[u] + weight < dist[v]
                if (distanceArray[u] != 1e9 && distanceArray[u] + weight < distanceArray[v])
                    distanceArray[v] = distanceArray[u] + weight;
            }
        }

        // In nth relaxation to check the negative cycle
        for(ArrayList<Integer> it : list){
            int u = it.get(0);
            int v = it.get(1);
            int weight = it.get(2);

            if (distanceArray[u] != 1e9 && distanceArray[u] + weight < distanceArray[v]){
                int[] temp = new int[1];
                temp[0] = -1;
                return temp;
            }
        }
        return distanceArray;
    }

    public static void main(String[] args) {
        int V = 6;
        int S = 0;
        ArrayList<ArrayList<Integer>> edges = new ArrayList<>() {
            {
                add(new ArrayList<Integer>(Arrays.asList(3, 2, 6)));
                add(new ArrayList<Integer>(Arrays.asList(5, 3, 1)));
                add(new ArrayList<Integer>(Arrays.asList(0, 1, 5)));
                add(new ArrayList<Integer>(Arrays.asList(1, 5, -3)));
                add(new ArrayList<Integer>(Arrays.asList(1, 2, -2)));
                add(new ArrayList<Integer>(Arrays.asList(3, 4, -2)));
                add(new ArrayList<Integer>(Arrays.asList(2, 4, 3)));
            }
        };



        int[] dist = BellmanFordAlgorithm.bellman_ford(V, edges, S);
        for (int i = 0; i < V; i++) {
            System.out.print(dist[i] + " ");
        }
        System.out.println("");
    }

}
