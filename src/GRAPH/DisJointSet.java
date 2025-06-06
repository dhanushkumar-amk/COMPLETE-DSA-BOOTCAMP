package GRAPH;

import java.util.*;

public class DisJointSet {

    // create the parent and rank array
    List<Integer> rank = new ArrayList<>();
    List<Integer> parent = new ArrayList<>();
    List<Integer> size = new ArrayList<>();


    // filled with rank[0] and parent[i] itself as iinit
    public DisJointSet(int n) {
        for (int i = 0; i < n; i++) {
            rank.add(0);
            parent.add(i);
            size.add(1);
        }
    }

    // find parent method
    public int findParent(int node){

        // base case
        if (node == parent.get(node))
            return node;

        int ultimateParent = findParent(parent.get(node));
        parent.set(node, ultimateParent); // path compression

         return parent.get(node);
    }

    // union by rank method
    public void unionByRank(int u, int v){

        int ultimateParentOfU = findParent(u);
        int ultimateParentOfV = findParent(v);

        // if both belongs to same parent nothing can do just return
        if (ultimateParentOfU == ultimateParentOfV)
            return;

        // if one element is smaller then that is attached to larger

        // if u < to V then u attached  to v
        if (rank.get(ultimateParentOfU) < rank.get(ultimateParentOfV)) {
            parent.set(ultimateParentOfU, ultimateParentOfV);
        }
        // if v < u then v attached to u
        else if(rank.get(ultimateParentOfV) < rank.get(ultimateParentOfU)) {
            parent.set(ultimateParentOfV, ultimateParentOfU);
        }
        // if both are same
        else{
            parent.set(ultimateParentOfV, ultimateParentOfU);  // or parent.set(ultimateParentOfU, ultimateParentOfV); your wish
            int ultimateRank = rank.get(ultimateParentOfU);
            rank.set(ultimateParentOfU, ultimateRank + 1);
        }
    }

    // union by rank method
    public void unionBySize(int u, int v){

        int ultimateParentOfU = findParent(u);
        int ultimateParentOfV = findParent(v);

        // if both belongs to same parent nothing can do just return
        if (ultimateParentOfU == ultimateParentOfV)
            return;

        // if one element is smaller then that is attached to larger

        if(size.get(ultimateParentOfU) < size.get(ultimateParentOfV)){
            parent.set(ultimateParentOfU, ultimateParentOfV);
            size.set(ultimateParentOfV, size.get(ultimateParentOfU) + size.get(ultimateParentOfV));
        }
        else{
            parent.set(ultimateParentOfV, ultimateParentOfU);
            size.set(ultimateParentOfU, size.get(ultimateParentOfU) + size.get(ultimateParentOfV));
        }
    }

    public static void main(String[] args) {
        DisJointSet ds = new DisJointSet(8);
        ds.unionByRank(1, 2);
        ds.unionByRank(2, 3);
        ds.unionByRank(4, 5);
        ds.unionByRank(6, 7);
        ds.unionByRank(5, 6);

        // if 3 and 7 same or not
        if (ds.findParent(3) == ds.findParent(7)) {
            System.out.println("Same");
        } else
            System.out.println("Not Same");

        ds.unionByRank(3, 7);
        if (ds.findParent(3) == ds.findParent(7)) {
            System.out.println("Same");
        } else
            System.out.println("Not Same");
    }
}
