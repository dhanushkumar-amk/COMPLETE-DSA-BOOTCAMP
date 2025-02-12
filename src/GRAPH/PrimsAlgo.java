package GRAPH;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class PrimsAlgo {

    class Pair {
        int node;
        int distance;

        public Pair(int distance, int node) {
            this.distance = distance;
            this.node = node;
        }
    }

    int spanningTree(int V, ArrayList<ArrayList<ArrayList<Integer>>> list) {

        // Min-heap priority queue to pick the smallest edge
        PriorityQueue<Pair> priorityQueue = new PriorityQueue<>((x, y) -> x.distance - y.distance);

        int[] visited = new int[V];
        int[] parent = new int[V]; // To store the parent of each node in MST
        ArrayList<ArrayList<Integer>> mstList = new ArrayList<>(); // To store MST edges

        priorityQueue.add(new Pair(0, 0)); // Start from node 0 with weight 0
        int sum = 0;

        while (!priorityQueue.isEmpty()) {

            int weight = priorityQueue.peek().distance;
            int node = priorityQueue.peek().node;
            priorityQueue.remove();

            // If already visited, ignore
            if (visited[node] == 1)
                continue;

            visited[node] = 1;
            sum += weight;

            // Store the edge in MST if it's not the first node
            if (node != 0) {
                ArrayList<Integer> edge = new ArrayList<>();
                edge.add(parent[node]); // Parent node
                edge.add(node); // Current node
                mstList.add(edge);
            }

            // Traverse adjacent nodes
            for (int i = 0; i < list.get(node).size(); i++) {
                int adjNode = list.get(node).get(i).get(0);
                int adjWeight = list.get(node).get(i).get(1);

                if (visited[adjNode] == 0) {
                    priorityQueue.add(new Pair(adjWeight, adjNode));
                    parent[adjNode] = node; // Track parent of adjNode
                }
            }
        }

        // Print the MST edges
        System.out.println("Minimum Spanning Tree Edges:");
        for (ArrayList<Integer> edge : mstList) {
            System.out.println(edge.get(0) + " - " + edge.get(1));
        }

        return sum; // Return the sum of MST weights
    }

    // Main method to test the implementation
    public static void main(String[] args) {
        PrimsAlgo obj = new PrimsAlgo();
        int V = 5; // Number of vertices

        // Graph representation using adjacency list
        ArrayList<ArrayList<ArrayList<Integer>>> graph = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }

        // Add edges in (node, weight) format
        obj.addEdge(graph, 0, 1, 2);
        obj.addEdge(graph, 0, 3, 6);
        obj.addEdge(graph, 1, 2, 3);
        obj.addEdge(graph, 1, 3, 8);
        obj.addEdge(graph, 1, 4, 5);
        obj.addEdge(graph, 2, 4, 7);
        obj.addEdge(graph, 3, 4, 9);

        // Find and print MST sum
        int mstSum = obj.spanningTree(V, graph);
        System.out.println("Sum of MST Weights: " + mstSum);
    }

    // Method to add an edge to the adjacency list representation
    void addEdge(ArrayList<ArrayList<ArrayList<Integer>>> graph, int u, int v, int weight) {
        ArrayList<Integer> edge1 = new ArrayList<>();
        edge1.add(v);
        edge1.add(weight);
        graph.get(u).add(edge1);

        ArrayList<Integer> edge2 = new ArrayList<>();
        edge2.add(u);
        edge2.add(weight);
        graph.get(v).add(edge2);
    }
}
