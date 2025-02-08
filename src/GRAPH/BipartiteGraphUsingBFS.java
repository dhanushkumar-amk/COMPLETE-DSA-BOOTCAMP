package GRAPH;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BipartiteGraphUsingBFS {

    boolean isBipartite(int v,  ArrayList <ArrayList< Integer >> list){

        int[] color = new int[v];

        Arrays.fill(color, -1);

        for (int i = 0; i < v; i++) {
            if (color[i] == -1){
                if (!check(i, v, list, color))
                    return false;
            }
        }
        return true;
    }

    private boolean check(int start, int v, ArrayList<ArrayList<Integer>> list, int[] color) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);

        // initial color is 0 thn alternatively changed
        color[start] = 0;

        while(!queue.isEmpty()){
            int node = queue.peek();
            queue.poll();

            for(int i : list.get(node)){
                if (color[i] == -1) {
                    color[i] = 1 - color[node];
                    queue.add(i);
                    // both are same color adjacent element
                } else if (color[i] == color[node]) {
                    return false;

                }
            }
        }
        return true;
    }


    public static void main(String[] args)
    {
        // V = 4, E = 4
        ArrayList <ArrayList< Integer >> adj = new ArrayList < > ();
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

        BipartiteGraphUsingBFS obj = new BipartiteGraphUsingBFS();
        boolean ans = obj.isBipartite(4, adj);
        if(ans)
            System.out.println("1");
        else System.out.println("0");
    }
}
