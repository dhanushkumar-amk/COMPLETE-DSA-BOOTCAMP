package GRAPH;

// https://leetcode.com/problems/cheapest-flights-within-k-stops/
// leetcode 787

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

    public int findCheapestPrice(int n, int[][] flights, int source, int destination, int k){

        // create the graph and add elements to it
        ArrayList<ArrayList<Pair>> list = new ArrayList<>();
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
            int cost = iterator.distance;
            queue.remove();

            if (steps > k)
                continue;

            for(Pair it : list.get(node)){
                int adjNode = it.first;
                int adjDistance = it.second;

                if (cost + adjDistance < distanceArray[adjNode] && steps <= k){
                    distanceArray[adjNode] = cost + adjDistance;
                    queue.add(new tuple(steps + 1, adjNode, cost + adjDistance));
                }
            }
        }

        if (distanceArray[destination] == (int)(1e9))
            return -1;

        return distanceArray[destination];
    }

    public static void main(String[] args) {

        int n = 4, src = 0, dst = 3, K = 1;
        int[][] flights={{0, 1, 100}, {1, 2, 100}, {2, 0, 100}, {1, 3, 600}, {2, 3, 200}};

        CheapestFlightsWithInKSteps obj = new CheapestFlightsWithInKSteps();
        int ans = obj.findCheapestPrice(n,flights,src,dst,K);

        System.out.print(ans);
        System.out.println();
    }

}
