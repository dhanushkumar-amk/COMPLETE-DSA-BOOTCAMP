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

    static int spanningTree(int V, ArrayList<ArrayList<ArrayList<Integer>>> list){

        PriorityQueue<Pair> priorityQueue = new PriorityQueue<>((x, y) -> x.distance - y.distance);
        

    }
}
