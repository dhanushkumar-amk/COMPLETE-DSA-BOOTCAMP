package GRAPH;


import javax.swing.plaf.IconUIResource;
import java.util.*;

public class MakingALargeIsland {
    List<Integer> rank = new ArrayList<>();
    List<Integer> parent = new ArrayList<>();
    List<Integer> size = new ArrayList<>();
    public MakingALargeIsland(int n) {
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
        int ulp = findUPar(parent.get(node));
        parent.set(node, ulp);
        return parent.get(node);
    }

    public void unionByRank(int u, int v) {
        int ulp_u = findUPar(u);
        int ulp_v = findUPar(v);
        if (ulp_u == ulp_v) return;
        if (rank.get(ulp_u) < rank.get(ulp_v)) {
            parent.set(ulp_u, ulp_v);
        } else if (rank.get(ulp_v) < rank.get(ulp_u)) {
            parent.set(ulp_v, ulp_u);
        } else {
            parent.set(ulp_v, ulp_u);
            int rankU = rank.get(ulp_u);
            rank.set(ulp_u, rankU + 1);
        }
    }

    public void unionBySize(int u, int v) {
        int ulp_u = findUPar(u);
        int ulp_v = findUPar(v);
        if (ulp_u == ulp_v) return;
        if (size.get(ulp_u) < size.get(ulp_v)) {
            parent.set(ulp_u, ulp_v);
            size.set(ulp_v, size.get(ulp_v) + size.get(ulp_u));
        } else {
            parent.set(ulp_v, ulp_u);
            size.set(ulp_u, size.get(ulp_u) + size.get(ulp_v));
        }
    }

    public int MaxConnection(int[][] grid){
        int n = grid.length;

        MakingALargeIsland ds = new MakingALargeIsland(n);

        for (int row = 0; row < n ; row++) {
            for (int col = 0; col < n ; col++) {

                if (grid[row][col] == 0)
                    continue;

                int[] deltaRow = { -1, 0, 1, 0};
                int[] deltaCol = {0, -1, 0, 1};

                for (int index = 0; index < 4; index++) {
                    int neighbourRow = row + deltaRow[index];
                    int neighbourCol = col + deltaCol[index];
                    if (isValid(neighbourRow, neighbourCol, n) && grid[neighbourRow][neighbourCol] == 1) {
                        int nodeNo = row * n + col;
                        int adjNodeNo = neighbourRow * n + neighbourCol;
                        ds.unionBySize(nodeNo, adjNodeNo);
                    }
                }
            }
        }


        int maxIsland = 0;
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                
                if (grid[row][col] == 1) 
                    continue;
                
                int[] deltaRow = { -1, 0, 1, 0};
                int[] deltaCol= {0, -1, 0, 1};
                
                HashSet<Integer> components = new HashSet<>();
                
                for (int ind = 0; ind < 4; ind++) {
                    
                    int neighbourRow = row + deltaRow[ind];
                    int neighbourCol = col + deltaCol[ind];
                    
                    if (isValid(neighbourRow, neighbourCol, n)) {
                        if (grid[neighbourRow][neighbourCol] == 1) {
                            components.add(ds.findUPar(neighbourRow * n + neighbourCol));
                        }
                    }
                }
                int sizeTotal = 0;
                for (Integer parents : components) {
                    sizeTotal += ds.size.get(parents);
                }
                maxIsland = Math.max(maxIsland, sizeTotal + 1);
            }
        }
        for (int cellNo = 0; cellNo < n * n; cellNo++) {
            maxIsland = Math.max(maxIsland, ds.size.get(ds.findUPar(cellNo)));
        }
        return maxIsland;
    }


    private boolean isValid(int neighbourRow, int neighbourCol, int n) {
        return neighbourRow >= 0 && neighbourRow < n && neighbourCol >= 0 && neighbourCol < n;
    }
}
