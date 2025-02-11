package GRAPH;

import java.util.*;

public class MinimumMultiplicationsToReachEnd {

    class Pair{
        int first;
        int second;

        public Pair(int node, int steps) {
            this.second = node;
            this.first = steps;
        }
    }

    public  int minimumMultiplications(int n, ArrayList<ArrayList<Integer>> roads){

        ArrayList<ArrayList<Pair>> list = new ArrayList<>();
        for (int i = 0; i < n; i++)
            list.add(new ArrayList<>());

        int m = roads.size();
        for (int i = 0; i < m; i++) {
            list.get(roads.get(i).get(0)).add(new Pair(roads.get(i).get(1), roads.get(i).get(2)));
            list.get(roads.get(i).get(1)).add(new Pair(roads.get(i).get(0), roads.get(i).get(2)));
        }

        PriorityQueue<Pair> queue = new PriorityQueue<>((x, y) -> x.first - y.first);

        int[] distanceArray = new int[]
    }
}
