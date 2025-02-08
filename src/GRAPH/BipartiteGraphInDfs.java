package GRAPH;

import java.util.*;

//https://leetcode.com/problems/is-graph-bipartite/description/
// leetcode = 

public class BipartiteGraphInDfs {
    public boolean isBipartite(int v, ArrayList<ArrayList<Integer>>list){

        int[] color = new int[v];
        Arrays.fill(color,-1);

        // components
        for (int i = 0; i < v; i++) {
            if (color[i] == -1){
                if (!dfs(i, 0, color, list))
                    return false;
            }
        }
        return true;
    }

    private boolean dfs(int node, int currentColor, int[] color, ArrayList<ArrayList<Integer>> list) {

        color[node] = currentColor;

        for(int i : list.get(node)){
            if (color[i] == -1){
                if (!dfs(i, 1 - currentColor, color, list))
                    return false;
            } else if (color[i] == currentColor) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args)
    {
        // V = 4, E = 4
        ArrayList < ArrayList < Integer >> adj = new ArrayList < > ();
        for (int i = 0; i < 4; i++) {
            adj.add(new ArrayList < > ());
        }
        adj.get(0).add(2);
        adj.get(2).add(0);
        adj.get(0).add(3);
        adj.get(3).add(0);
        adj.get(1).add(3);
        adj.get(3).add(1);
        adj.get(2).add(3);
        adj.get(3).add(2);

        BipartiteGraphInDfs obj = new BipartiteGraphInDfs();
        boolean ans = obj.isBipartite(4, adj);
        if(ans)
            System.out.println("1");
        else System.out.println("0");
    }
}
