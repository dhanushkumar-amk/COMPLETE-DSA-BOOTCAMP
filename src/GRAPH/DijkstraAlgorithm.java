package GRAPH;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class DijkstraAlgorithm {

    public int[] dijkstra(int v, ArrayList<ArrayList<Integer>> list, int src){

        PriorityQueue<Pair> pQueue = new PriorityQueue<Pair>((x, y) -> x.distance + y.distance);

    }
}
