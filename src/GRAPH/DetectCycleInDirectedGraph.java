package GRAPH;

import java.util.ArrayList;

public class DetectCycleInDirectedGraph {


    public boolean isCyclic(int v, ArrayList<ArrayList<Integer>> list){

        int[] visited = new int[v];
        int[] pathVisited = new int[v];

        for (int i = 0; i < v; i++) {
            if (visited[i] == 0) {
                // it is cycl then it ist true
                if (dfs(i, list, visited, pathVisited))
                    return true;
            }


        }
    }
}
