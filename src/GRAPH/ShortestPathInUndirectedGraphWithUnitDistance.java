package GRAPH;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

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

        // set default value to src is 0
        distance[src] = 0;

        // create the src and add the src path as a initial value
        Queue<Integer> queue = new LinkedList<>();
        queue.add(src);

        while (!queue.isEmpty()){
            int node = queue.poll();

            for(int it : adj.get(node)){
                if (distance[node] + 1 < distance[it]){
                    distance[it] = 1 + distance[node];
                    queue.add(it);
                }
            }
        }

        // if node is not visited means set as a -1
        for (int i = 0; i < n; i++) {
            if (distance[i] == 1e9)
                distance[i] = -1;
        }

        return distance;
    }
}
