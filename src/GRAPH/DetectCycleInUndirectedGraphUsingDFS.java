package GRAPH;

import java.util.ArrayList;

public class DetectCycleInUndirectedGraphUsingDFS {


    private  boolean dfs(int node, int parent, int[] visited, ArrayList<ArrayList<Integer>> list){
        visited[node] = 1;

        for(int adjacentNode : list.get(node)){

            if (visited[adjacentNode]== 0) {
                if (dfs())
            }

        }
    }

}
