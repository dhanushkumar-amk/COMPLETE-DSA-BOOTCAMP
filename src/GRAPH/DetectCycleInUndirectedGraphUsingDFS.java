package GRAPH;

import java.util.ArrayList;

public class DetectCycleInUndirectedGraphUsingDFS {


    private  boolean dfs(int node, int parent, int[] visited, ArrayList<ArrayList<Integer>> list){
        visited[node] = 1;

        for(int adjacentNode : list.get(node)){

            if (visited[adjacentNode]== 0) {
                if(dfs(adjacentNode, node, visited, list))
                    return true;
            }
            else if(adjacentNode != parent)
                return true;
        }
        return false;
    }


    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        int vis[] = new int[V];
        for(int i = 0;i<V;i++) {
            if(vis[i] == 0) {
                if(dfs(i, -1, vis, adj))
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

        DetectCycleInUndirectedGraphUsingDFS obj = new DetectCycleInUndirectedGraphUsingDFS();
        boolean ans = obj.isCycle(4, adj);
        if (ans)
            System.out.println("1");
        else
            System.out.println("0");
    }

}
