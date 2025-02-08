package GRAPH;

import java.util.ArrayList;

public class DetectCycleInDirectedGraph {


    public boolean isCyclic(int v, ArrayList<ArrayList<Integer>> list){

        int[] visited = new int[v];
        int[] pathVisited = new int[v];

        for (int i = 0; i < v; i++) {
            if (visited[i] == 0) {
                // it is cycle then it ist true
                if (dfs(i, list, visited, pathVisited))
                    return true;
            }
        }
        return false;
    }

    private boolean dfs(int node, ArrayList<ArrayList<Integer>> list, int[] visited, int[] pathVisited) {

        visited[node] = 1;

        // backtrack
        pathVisited[node] = 1;

        for(int it : list.get(node)){
            if (visited[it] == 0){
                if (dfs(it, list, visited, pathVisited))
                    return true;
            }
            // if the node has been previous visited but it has been visited on the same path
            else if (pathVisited[it] == 1)
                return true;
        }

        // backtrack
        pathVisited[node] = 0;
        return false;
    }


    public static void main(String[] args) {
            int V = 11;
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            for (int i = 0; i < V; i++) {
                adj.add(new ArrayList<>());
            }
            adj.get(1).add(2);
            adj.get(2).add(3);
            adj.get(3).add(4);
            adj.get(3).add(7);
            adj.get(4).add(5);
            adj.get(5).add(6);
            adj.get(7).add(5);
            adj.get(8).add(9);
            adj.get(9).add(10);
            adj.get(10).add(8);

            DetectCycleInDirectedGraph obj = new DetectCycleInDirectedGraph();
            boolean ans = obj.isCyclic(V, adj);
            if (ans)
                System.out.println("True");
            else
                System.out.println("False");

        }
}
