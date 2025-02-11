package GRAPH;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Pair{
    int first;
    int second;

    public Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }
}

class tuple{
    int steps;
    int node;
    int distance;

    public tuple(int steps, int node, int distance) {
        this.steps = steps;
        this.node = node;
        this.distance = distance;
    }
}


public class CheapestFlightsWithInKSteps {

    public int cheapFlight(int n, int[][] flights, int source, int destination, int k){

        // create the graph and add elements to it
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new ArrayList<>());
        }

        int m = flights.length;

        for (int i = 0; i < m; i++) {
            list.get(flights[i][0]).add(new Pair(flights[i][1], flights[i][2]));
        }


        Queue<tuple> queue = new LinkedList<>();
        // [steps, [node, distance]
        queue.add(new tuple(0, source, 0)); // added as source node

        // create the distance array marked as infinity
        int[] distanceArray = new int[n];
        for (int i = 0; i < n; i++)
            distanceArray[i] = (int)(1e9);

        distanceArray[source] = 0;


        while(!queue.isEmpty()){

            tuple iterator = queue.peek();
            int steps = iterator.steps;
            int node = iterator.node;
            int distance = iterator.distance;

            if (steps > k)
                continue;

            for(Pair it : list.get(node))
        }

    }

}
