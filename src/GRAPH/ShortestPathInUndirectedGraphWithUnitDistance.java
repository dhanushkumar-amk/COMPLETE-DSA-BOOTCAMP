package GRAPH;

import java.util.ArrayList;

public class ShortestPathInUndirectedGraphWithUnitDistance {

    public int[] shortestPath(int[][] edges, int n, int m,int src){

        // convert  matrix into graph
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }


        for (int i = 0; i < m; i++) {
            adj.get(edges[i][0]).add(edges[i][1]);
            
        }
    }
}
