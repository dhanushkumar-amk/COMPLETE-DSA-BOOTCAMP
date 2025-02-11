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
           list.get(matrix[i][0]).add(new Pair(matrix[i][1], matrix[i][2]));
           list.get(matrix[i][1]).add(new Pair(matrix[i][0], matrix[i][2]));
        }




    }
}
