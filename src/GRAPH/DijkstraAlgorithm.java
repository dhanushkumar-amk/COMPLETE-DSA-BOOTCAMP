package GRAPH;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class DijkstraAlgorithm {

    import java.util.PriorityQueue;

    class Pair {
        int distance;
        int value;

        public Pair(int distance, int value) {
            this.distance = distance;
            this.value = value;
        }
    }


    public int[] dijkstra(int v, ArrayList<ArrayList<Integer>> list, int src){

        PriorityQueue<Pair> pQueue = new PriorityQueue<Pair>((x, y) -> x.distance + y.distance);

    }
}
