package GRAPH;

// https://leetcode.com/problems/number-of-operations-to-make-network-connected/
//1319


import java.util.*;

public class NumberOfOperationsToMajeConnectedGraph {

    List<Integer> size = new ArrayList<>();
    List<Integer> parent = new ArrayList<>();

    public NumberOfOperationsToMajeConnectedGraph(int n) {
        // Initialize the parent and size lists for each node.
        for (int i = 0; i <= n; i++) {
            parent.add(i);  // Each node is initially its own parent.
            size.add(1);    // Initially, each set has a size of 1.
        }
    }

    public int findUPar(int node) {
        if (node == parent.get(node)) {
            return node;  // If the node is its own parent, it's the representative of its set.
        }
        // Recursively find the ultimate parent and update the parent list for path compression.
        int ulp = findUPar(parent.get(node));
        parent.set(node, ulp); // Path compression: update the parent to the ultimate parent.
        return parent.get(node);
    }

    public void unionBySize(int u, int v) {
        int ulp_u = findUPar(u);  // Find ultimate parent of u.
        int ulp_v = findUPar(v);  // Find ultimate parent of v.

        if (ulp_u == ulp_v) return;  // If they share the same parent, they are in the same set.

        if (size.get(ulp_u) < size.get(ulp_v)) {
            // Attach the smaller set to the larger set and update the size.
            parent.set(ulp_u, ulp_v);
            size.set(ulp_v, size.get(ulp_v) + size.get(ulp_u));
        } else {
            parent.set(ulp_v, ulp_u);
            size.set(ulp_u, size.get(ulp_u) + size.get(ulp_v));
        }
    }

    public int makeConnected(int n, int[][] connections) {

        NumberOfOperationsToMajeConnectedGraph ds = new NumberOfOperationsToMajeConnectedGraph(n);

        int extraEdgesCount = 0;

        int m = connections.length;

        for (int i = 0; i < m; i++) {
            int u = connections[i][0];
            int v = connections[i][1];

            // if both parent are equal then there is edges is free
            if (ds.findUPar(u) == ds.findUPar(v))
                extraEdgesCount++;

            // or connected use to merge using union by size or union by rank
            else
                ds.unionBySize(u, v);
        }

        int connectedComponentsCount = 0;

        for (int i = 0; i < n; i++) {
            if (ds.parent.get(i) == i)
             connectedComponentsCount++;
        }

        int answer = connectedComponentsCount - 1;

        if (extraEdgesCount >= answer)
            return answer;

        return -1;
    }
}
