package GRAPH;

import java.util.*;

public class KrusKalsAlgorithm {
    
    List<Integer> rank = new ArrayList<>();
    List<Integer> parent = new ArrayList<>();
    List<Integer> size = new ArrayList<>();
    
    public KrusKalsAlgorithm(int n) {
        for (int i = 0; i <= n; i++) {
            rank.add(0);
            parent.add(i);
            size.add(1);
        }
    }

    public int findUPar(int node) {
        if (node == parent.get(node)) {
            return node;
        }
        
        int ultimateParent = findUPar(parent.get(node));
        parent.set(node, ultimateParent);
        return parent.get(node);
    }

    public void unionByRank(int u, int v) {

        int ultimateParent_u = findUPar(u);
        int ultimateParent_v = findUPar(v);

        if (ultimateParent_u == ultimateParent_v)
            return;

        if (rank.get(ultimateParent_u) < rank.get(ultimateParent_v)) {
            parent.set(ultimateParent_u, ultimateParent_v);
        }
        else if (rank.get(ultimateParent_v) < rank.get(ultimateParent_u)) {
            parent.set(ultimateParent_v, ultimateParent_u);
        }
        else {
            parent.set(ultimateParent_v, ultimateParent_u);
            int rankU = rank.get(ultimateParent_u);
            rank.set(ultimateParent_u, rankU + 1);
        }
    }

    public void unionBySize(int u, int v) {

        int ultimateParent_u = findUPar(u);
        int ultimateParent_v = findUPar(v);

        if (ultimateParent_u == ultimateParent_v)
            return;

        if (size.get(ultimateParent_u) < size.get(ultimateParent_v)) {
            parent.set(ultimateParent_u, ultimateParent_v);
            size.set(ultimateParent_v, size.get(ultimateParent_v) + size.get(ultimateParent_u));
        }
        else {
            parent.set(ultimateParent_v, ultimateParent_u);
            size.set(ultimateParent_u, size.get(ultimateParent_u) + size.get(ultimateParent_v));
        }
    }
}
class Edge implements Comparable<Edge> {
    int src;
    int destination;
    int weight;

    Edge(int source, int destination, int weight) {
        this.src = source;
        this.destination = destination;
        this.weight = weight;
    }
    // Comparator function used for
    // sorting edgesbased on their weight
    public int compareTo(Edge compareEdge) {
        return this.weight - compareEdge.weight;
    }

    int spanningTree(int V, ArrayList<ArrayList<ArrayList<Integer>>> list){

        List<Edge> edges = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            for (int j = 0; j < list.get(i).size(); j++) {

                int adjNode = list.get(i).get(j).get(0);
                int weight = list.get(i).get(j).get(1);
                int node = i;

                Edge temp = new Edge(i, adjNode, weight);
                edges.add(temp);
            }
        }

        KrusKalsAlgorithm ds = new KrusKalsAlgorithm(V);
        Collections.sort(edges);
        int mstWt = 0;
        // M x 4 x alpha x 2
        for (int i = 0; i < edges.size(); i++) {
            int wt = edges.get(i).weight;
            int u = edges.get(i).src;
            int v = edges.get(i).destination;

            if (ds.findUPar(u) != ds.findUPar(v)) {
                mstWt += wt;
                ds.unionBySize(u, v);
            }
        }

        return mstWt;

    }
}
