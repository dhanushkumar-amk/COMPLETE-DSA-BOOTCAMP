package GRAPH;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class DetectCycleInUndirectedGraphUsingBFS {

    public boolean checkForCycle(int src, int v, ArrayList<ArrayList<Integer>> list, boolean[] visited ){
        visited[src] = true;

        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(src, -1));

        while(!queue.isEmpty()){
            int node = queue.peek().first;
            int parent = queue.peek().second;
            queue.remove();

            for( int adjacentNode : list.get(node)){
                if (!visited[adjacentNode]){
                    visited[adjacentNode] = true;
                    queue.add(new Pair(adjacentNode, node));
                }
                // if someone already visited that element before means cyclic
                else if(parent != adjacentNode){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isCycle(int v, ArrayList<ArrayList<Integer>> list){

        boolean[] visited = new boolean[v];

        for (int i = 0; i < v; i++) {
            if (!visited[i]){
                if (checkForCycle(i, v, list, visited))
                    return true;
            }
        }
        return false;
    }


    public static void main(String[] args)
    {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            adj.add(new ArrayList < > ());
        }
        adj.get(1).add(2);
        adj.get(2).add(1);
        adj.get(2).add(3);
        adj.get(3).add(2);

        DetectCycleInUndirectedGraphUsingBFS obj = new DetectCycleInUndirectedGraphUsingBFS();
        boolean ans = obj.isCycle(4, adj);
        if (ans)
            System.out.println("1");
        else
            System.out.println("0");
    }

    class Pair{
        int first;
        int second;

        public Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }
}
