package GRAPH;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class PrimsAlgo {

    class Pair{
        int node;
        int distance;

        public Pair(int distance, int node) {
            this.distance = distance;
            this.node = node;
        }
    }

     int spanningTree(int V, ArrayList<ArrayList<Integer>> list){

        PriorityQueue<Pair> priorityQueue = new PriorityQueue<>((x, y) -> x.distance - y.distance);

        int[] visited = new int[V];

        priorityQueue.add(new Pair(0,0));
        int sum = 0;

        while (!priorityQueue.isEmpty()){

            int weight = priorityQueue.peek().distance;
            int node = priorityQueue.peek().node;
            priorityQueue.remove();

            if (visited[node] == 1)
                continue;

            visited[node] = 1;
            sum += weight;

            for (int i = 0; i <list.get(node).size(); i++) {
                int adjWeight = list.get(node).get(i).get(1);
                int adjNode = list.get(node).get(i).get(0);

                if (visited[adjNode] == 1)
                    priorityQueue.add(new Pair(adjWeight, adjNode));
            }

        }
    return sum;
    }
}
