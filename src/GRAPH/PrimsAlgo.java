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

    int spanningTree(int V, ArrayList<ArrayList<Integer>> list) {

        PriorityQueue<Pair> priorityQueue = new PriorityQueue<>((x, y) -> x.distance - y.distance);

        int[] visited = new int[V];
        int[] parent = new int[V]; // To store the parent of each node in MST
        ArrayList<ArrayList<Integer>> mstList = new ArrayList<>(); // To store the MST edges

        priorityQueue.add(new Pair(0, 0));
        int sum = 0;

        while (!priorityQueue.isEmpty()) {

            int weight = priorityQueue.peek().distance;
            int node = priorityQueue.peek().node;
            priorityQueue.remove();

            if (visited[node] == 1)
                continue;

            visited[node] = 1;
            sum += weight;

            if (node != 0) { // Skip adding edge for the starting node
                ArrayList<Integer> edge = new ArrayList<>();
                edge.add(parent[node]); // Parent node
                edge.add(node); // Current node
                mstList.add(edge);
            }

            for (int i = 0; i < list.get(node).size(); i++) {
                int adjWeight = list.get(node).get(i).get(1);
                int adjNode = list.get(node).get(i).get(0);

                if (visited[adjNode] == 0) {
                    priorityQueue.add(new Pair(adjWeight, adjNode));
                    parent[adjNode] = node; // Set parent for the adjacent node
                }
            }
        }

        // Now mstList contains the list of edges in the MST
        for (ArrayList<Integer> edge : mstList) {
            System.out.println(edge.get(0) + " - " + edge.get(1));
        }

        return sum;
    }
}
