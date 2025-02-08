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
}
