package GRAPH;

import java.util.*;

public class EventualSafeStates {

    public List<Integer> eventualSafeNodes(List<List<Integer>> list) {

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

    private boolean dfs(int node, List<List<Integer>> list, int[] visited, int[] pathVisited, int[] check) {

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
            // if the second has been previous visited but it has been visited on the same path
            else if (pathVisited[it] == 1)
                return true;
        }

        // backtrack
        pathVisited[node] = 0;
        check[node] = 1;
        return false;
    }


    public static void main(String[] args) {
        int V = 12;
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        adj.get(0).add(1);
        adj.get(1).add(2);
        adj.get(2).add(3);
        adj.get(2).add(4);
        adj.get(3).add(4);
        adj.get(3).add(5);
        adj.get(4).add(6);
        adj.get(5).add(6);
        adj.get(6).add(7);
        adj.get(8).add(1);
        adj.get(8).add(9);
        adj.get(9).add(10);
        adj.get(10).add(8);
        adj.get(11).add(9);

        EventualSafeStates obj = new EventualSafeStates();
        List<Integer> safeNodes = obj.eventualSafeNodes(adj);

        for (int node : safeNodes) {
            System.out.print(node + " ");
        }
        System.out.println("");
    }
}
