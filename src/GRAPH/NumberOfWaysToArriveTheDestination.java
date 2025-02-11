package GRAPH;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class NumberOfWaysToArriveTheDestination {
    class Pair {
        int first;
        int second;
        public Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }

    public  int countPath(int n, List<List<Integer>> roads){

        // create the graph
        ArrayList<ArrayList<Pair>> list = new ArrayList<>();

        for (int i = 0; i < n; i++)
            list.add(new ArrayList<>());

        int m = roads.size();
        for (int i = 0; i < m; i++) {
            list.get(roads.get(i).get(0)).add(new Pair(roads.get(i).get(1), roads.get(i).get(2)));
            list.get(roads.get(i).get(1)).add(new Pair(roads.get(i).get(0), roads.get(i).get(2)));
        }

        // create priority queue
        PriorityQueue<Pair> priorityQueue = new PriorityQueue<Pair>((x, y) -> x.first - y.first);

        // create the arrays filled with default values
        int[] distanceArray = new int[n];
        int[] ways = new int[n];

        for (int i = 0; i < n; i++) {
            distanceArray[i] = (int)(1e9);
            ways[i] = 0;
        }

        // initial source configuration
        distanceArray[0] = 0;
        ways[0] = 1;
        priorityQueue.add(new Pair(0, 0));

        int mod = (int)(1e9 + 7);

        while (!priorityQueue.isEmpty()){
            int distance = priorityQueue.peek().first;
            int node = priorityQueue.peek().second;
            priorityQueue.remove();

            for(Pair it : list.get(node)){
                int adjNode = it.first;
                int adjWeight = it.second;

                // if first time we are coming on the particular element
                if (distance + adjWeight < distanceArray[adjNode]){
                    distanceArray[adjNode] = distance + adjWeight;
                    priorityQueue.add(new Pair(distance + adjWeight, adjNode));
                    ways[adjNode] = ways[node];
                } else if (distance + adjWeight == distanceArray[adjNode]) {
                    // same shortest distance again we git so we don't need to update the path
                    ways[adjNode] = (ways[adjNode] + ways[node]) % mod;
                }
            }

        }
        return ways[n - 1] % mod;
    }
}

/*
class Pair{
    long dis;
    long node;
    public Pair(long dis,long node){
        this.dis=dis;
        this.node=node;
    }
}
class Solution {
    public int countPaths(int n, int[][] roads) {
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<roads.length;i++){
            adj.get(roads[i][0]).add(new Pair(roads[i][2],roads[i][1]));
            adj.get(roads[i][1]).add(new Pair(roads[i][2],roads[i][0]));
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>((x,y)->Long.compare(x.dis, y.dis));
        long dis[]=new long[n];
        long ways[]=new long[n];
        for(int i=0;i<n;i++){
            dis[i]=Long.MAX_VALUE;
            ways[i]=0;
        }
        pq.add(new Pair(0,0));
        dis[0]=0;
        ways[0]=1;
        int mod = (int) (1e9 + 7);
        while(!pq.isEmpty()){
            long currDis=pq.peek().dis;
            int node=(int)(pq.peek().node);
            pq.remove();
            for(Pair it: adj.get(node)){
                int adjNode = (int)it.node;
                long edgeWeight = it.dis;
                if(currDis+edgeWeight<dis[adjNode]){
                    dis[adjNode]=currDis+edgeWeight;
                    ways[adjNode]=ways[node];
                    pq.add(new Pair(currDis+edgeWeight,adjNode));
                }else if(currDis+edgeWeight==dis[adjNode]){
                    ways[adjNode]= (ways[adjNode]+ways[node])%mod;
                }
            }
        }
        return (int)(ways[n-1]%mod);
    }
}
 */