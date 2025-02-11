package GRAPH;

import java.util.ArrayList;
import java.util.List;

public class ShortestPathInWeightedUndirectedGraph {

    class Pair{
        int weight;
        int node;

        public Pair(int weight, int node) {
            this.weight = weight;
            this.node = node;
        }
    }
    public  List<Integer> shortestPath(int n, int m, int[][] matrix){

        // create the graph
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int i = 0; i <= n; i++)
            list.add(new ArrayList<>());

        // added the edges given in matrix to list of graph
        for (int i = 0; i < m; i++) {
            int node1 = matrix[i][0];
            int node2 = matrix[i][1];
            int weight = matrix[i][2];

            list.get(node1).add(new Pair(weight, node2));
            list.get(node2).add(new Pair(weight, node1));
        }




    }
}
