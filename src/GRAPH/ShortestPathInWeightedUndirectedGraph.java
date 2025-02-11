package GRAPH;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class ShortestPathInWeightedUndirectedGraph {

    static class Pair{
        int weight;
        int node;

        public Pair(int weight, int node) {
            this.weight = weight;
            this.node = node;
        }
    }

        public static List<Integer> shortestPath(int n, int m, int[][] matrix) {

            // Create the graph
            ArrayList<ArrayList<Pair>> list = new ArrayList<>();
            for (int i = 0; i <= n; i++) {
                list.add(new ArrayList<>());  // Initialize adjacency list
            }

            // Add the edges given in the matrix to the list (graph representation)
            for (int i = 0; i < m; i++) {
                int node1 = matrix[i][0];
                int node2 = matrix[i][1];
                int weight = matrix[i][2];

                list.get(node1).add(new Pair(weight, node2)); // Add edge (node1 -> node2)
                list.get(node2).add(new Pair(weight, node1)); // Add edge (node2 -> node1) if undirected
            }


            // init queue parent[] and distance[];
            PriorityQueue<Pair>  pq = new PriorityQueue<>((x, y) -> x.weight - y.weight);
            int[] distance = new int[n - 1];
            int[] parent = new int[n - 1];






    }
}
