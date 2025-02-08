package GRAPH;

import java.util.ArrayList;

public class BipartiteGraphUsingBFS {

    boolean isBipartite(int v, )


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
