package GRAPH;

import java.util.*;

public class EventualSafeStates {

    public List<Integer> eventualSafeNodes(ArrayList<ArrayList<Integer>> list) {

        int v = list.size();

        int[] visited = new int[v];
        int[] pathVisited = new int[v];
        int[] check = new int[v];

        for (int i = 0; i < v; i++) {
            if (visited[i] == 0)
               dfs(i, list, visited, pathVisited, check);
        }

        ArrayList<Integer> safeNodes = new ArrayList<>();
        for (int i = 0; i < v; i++) {
            if (check[i] == 1)
                safeNodes.add(i);
        }
        return safeNodes;
    }

    private boolean dfs(int node, ArrayList<ArrayList<Integer>> list, int[] visited, int[] pathVisited, int[] check) {

        visited[node] = 1;

        // backtrack
        pathVisited[node] = 1;
        check[node] = 0;

        // for cycle check
        for(int it : list.get(node)){
            if (visited[it] == 0){
                if (dfs(it, list, visited, pathVisited, check))
                    return true;
            }
            // if the node has been previous visited but it has been visited on the same path
            else if (pathVisited[it] == 1)
                return true;
        }

        // backtrack
        pathVisited[node] = 0;
        check[node] = 1;
        return false;
    }
}
