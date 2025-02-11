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

    public tuple(int first, int second, int third) {
        this.steps = first;
        this.node = second;
        this.distance = third;
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
            list.get(i).add(flights[i][1],flights[i][2]);
        }


        Queue<tuple> queue = new LinkedList<>();
        // [steps, [node, distance]
        queue.add(new tuple(0,))


    }

}
