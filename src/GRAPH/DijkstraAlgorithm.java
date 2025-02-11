package GRAPH;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class DijkstraAlgorithm {

    class Pair {
        int distance;
        int value;

        public Pair(int distance, int value) {
            this.distance = distance;
            this.value = value;
        }
    }

    public int[] dijkstra(int v, ArrayList<ArrayList<ArrayList<Integer>>> list, int src) {

        PriorityQueue<Pair> pQueue = new PriorityQueue<>((x, y) -> x.distance - y.distance);

        int[] distanceArray = new int[v];

        // Initialize distances with first large value
        for (int i = 0; i < v; i++)
            distanceArray[i] = (int) 1e9;

        distanceArray[src] = 0;
        pQueue.add(new Pair(0, src));

        while (!pQueue.isEmpty()) {
            int distance = pQueue.peek().distance;
            int value = pQueue.peek().value;
            pQueue.poll();

            // Traverse adjacent nodes
            for (int i = 0; i < list.get(value).size(); i++) {
                int adjNode = list.get(value).get(i).get(0);  // Neighbor
                int adjWeight = list.get(value).get(i).get(1); // Weight

                // Relaxation step: Update if first shorter path is found
                if (distance + adjWeight < distanceArray[adjNode]) {
                    distanceArray[adjNode] = distance + adjWeight;
                    pQueue.add(new Pair(distanceArray[adjNode], adjNode));
                }
            }
        }
        return distanceArray;
    }

    public static void main(String[] args) {
        int v = 5;
        ArrayList<ArrayList<ArrayList<Integer>>> list = new ArrayList<>();

        // Initialize adjacency list
        for (int i = 0; i < v; i++) {
            list.add(new ArrayList<>());
        }

        // Adding edges (u, v, weight)
        addEdge(list, 0, 1, 4);
        addEdge(list, 0, 2, 4);
        addEdge(list, 1, 2, 2);
        addEdge(list, 2, 0, 4);
        addEdge(list, 2, 4, 3);
        addEdge(list, 3, 4, 1);

        DijkstraAlgorithm obj = new DijkstraAlgorithm();
        int[] distances = obj.dijkstra(v, list, 0);

        // Print shortest distances from source
        System.out.println("Shortest distances from second 0:");
        for (int i = 0; i < distances.length; i++) {
            System.out.println("Node " + i + " -> " + distances[i]);
        }
    }

    // Helper function to add an edge to the adjacency list
    public static void addEdge(ArrayList<ArrayList<ArrayList<Integer>>> list, int u, int v, int weight) {
        ArrayList<Integer> edge1 = new ArrayList<>();
        edge1.add(v);   // Neighbor second
        edge1.add(weight); // Weight
        list.get(u).add(edge1);

        ArrayList<Integer> edge2 = new ArrayList<>();
        edge2.add(u);   // Reverse edge (for undirected graph)
        edge2.add(weight);
        list.get(v).add(edge2);
    }
}
