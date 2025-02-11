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


    public int[] dijkstra(int v, ArrayList<ArrayList<Integer>> list, int src){

        PriorityQueue<Pair> pQueue = new PriorityQueue<Pair>((x, y) -> x.distance - y.distance);

        int[] distanceArray = new int[v];

        for (int i = 0; i < v; i++)
            distanceArray[i] = (int) 1e9;

        distanceArray[src] = 0;

        pQueue.add(new Pair(0, src));

        while (pQueue.size() != 0){
            int distance = pQueue.peek().distance;
            int value = pQueue.peek().value;
            pQueue.remove();

            // list
            for (int i = 0; i <list.get(value).size(); i++) {

                int adjWeight = list.get(value).get(i).get(1);
                int adjNode = list.get(value).get(i).get(0);

                if (distance + adjWeight< distanceArray[adjNode]){
                    distanceArray[adjNode] = distance + adjWeight;
                    pQueue.add(new Pair(distanceArray[adjNode], adjNode));
                }
            }
        }
        return distanceArray;
    }
}
