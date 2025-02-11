package GRAPH;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class ShortestPathInWeightedUndirectedGraph {

    static   class Pair {
        int distance;
        int value;

        public Pair(int distance, int value) {
            this.distance = distance;
            this.value = value;
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
            PriorityQueue<Pair>  pq = new PriorityQueue<>((x, y) -> x.distance - y.distance);
            int[] distanceArray = new int[n - 1];
            int[] parentArray = new int[n - 1];

            // fill with default values
            for (int i = 0; i <=n; i++) {
                distanceArray[i] = (int)(1e9);
                parentArray[i] = i;
            }

            // src = 1 so put default as 0
            distanceArray[1] = 0;
            pq.add(new Pair(0, 1));

            while (!pq.isEmpty()){
                Pair it = pq.peek();
                int node = it.value;
                int distance = it.distance;
                pq.remove();

                for(Pair iterator : list.get(node)){
                    int adjNode = iterator.value;
                    int adjDistance = iterator.distance;

                    if(adjDistance + distance < distanceArray[adjNode]){
                        distanceArray[adjNode] = distance + adjDistance;
                        pq.add(new Pair(distanceArray[adjNode], adjNode));
                        parentArray[adjNode] = node;
                    }
                }
            }



    }
}
