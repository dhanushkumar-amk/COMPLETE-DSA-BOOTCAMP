package GRAPH;


import java.util.*;

public class BipartiteGraphInDfs {

    public boolean isBipartite(int v, ArrayList<ArrayList<Integer>>adj){

        int[] color = new int[adj.size()];

        for (int i = 0; i < ; i++) {
            
        }
        

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
