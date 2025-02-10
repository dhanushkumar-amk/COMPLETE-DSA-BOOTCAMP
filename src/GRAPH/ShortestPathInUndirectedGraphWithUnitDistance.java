package GRAPH;

import java.util.ArrayList;

public class ShortestPathInUndirectedGraphWithUnitDistance {

    public int[] shortestPath(int[][] edges, int n, int m,int src){

        // convert  matrix into graph
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }


        // get all the elements from the matrix and added to the list
        for (int i = 0; i < m; i++) {
            adj.get(edges[i][0]).add(edges[i][1]); // 2 -> 1
            adj.get(edges[i][1]).add(edges[i][0]); // 1 -> 2
        }

        // create the distance array and make as a infinity
        int[] distance = new int[n];
        for (int i = 0; i < n; i++)
            distance[i] = (int) 1e9;



    }
}
