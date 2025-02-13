package GRAPH;

import java.util.ArrayList;
import java.util.List;

public class NumberOfIslands2 {

    // create the parent and rank array
    List<Integer> rank = new ArrayList<>();
    List<Integer> parent = new ArrayList<>();
    List<Integer> size = new ArrayList<>();


    // filled with rank[0] and parent[i] itself as iinit
    public NumberOfIslands2(int n) {
        for (int i = 0; i < n; i++) {
            rank.add(0);
            parent.add(i);
            size.add(1);
        }
    }

    // find parent method
    public int findParent(int node) {

        // base case
        if (node == parent.get(node))
            return node;

        int ultimateParent = findParent(parent.get(node));
        parent.set(node, ultimateParent); // path compression

        return parent.get(node);
    }

    // union by rank method
    public void unionByRank(int u, int v) {

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
        else if (rank.get(ultimateParentOfV) < rank.get(ultimateParentOfU)) {
            parent.set(ultimateParentOfV, ultimateParentOfU);
        }
        // if both are same
        else {
            parent.set(ultimateParentOfV, ultimateParentOfU);  // or parent.set(ultimateParentOfU, ultimateParentOfV); your wish
            int ultimateRank = rank.get(ultimateParentOfU);
            rank.set(ultimateParentOfU, ultimateRank + 1);
        }
    }

    // union by rank method
    public void unionBySize(int u, int v) {

        int ultimateParentOfU = findParent(u);
        int ultimateParentOfV = findParent(v);

        // if both belongs to same parent nothing can do just return
        if (ultimateParentOfU == ultimateParentOfV)
            return;

        // if one element is smaller then that is attached to larger

        if (size.get(ultimateParentOfU) < size.get(ultimateParentOfV)) {
            parent.set(ultimateParentOfU, ultimateParentOfV);
            size.set(ultimateParentOfV, size.get(ultimateParentOfU) + size.get(ultimateParentOfV));
        } else {
            parent.set(ultimateParentOfV, ultimateParentOfU);
            size.set(ultimateParentOfU, size.get(ultimateParentOfU) + size.get(ultimateParentOfV));
        }
    }


    public List<Integer> numOfIslands(int n, int m, int[][] operators) {

        NumberOfIslands2 ds = new  NumberOfIslands2(n * m);
        int[][] visitedArray = new int[n][m];
        int count = 0;

        List<Integer> answer = new ArrayList<>();
        int len = operators.length;

        for (int i = 0; i < len; i++) {
            int row = operators[i][0];
            int col = operators[i][1];

            // if the node already visited then add the count to the answer and skip it
            if (visitedArray[row][col] == 1) {
                answer.add(count);
                continue;
            }
            visitedArray[row][col] = 1;
            count++;


            int[] deltaRow = {-1, 0, 1, 0};
            int[] deltaCol = {0, 1, 0, -1};

            for (int index = 0; index < 4; index++) {
                int neighbourRow = row + deltaRow[index];
                int neighbourCol = col + deltaCol[index];

                if (isValid(neighbourRow, neighbourCol, n, m)){
                    if(visitedArray[neighbourRow][neighbourCol] == 1){
                        int nodeNumber = row * m + col;
                        int adjNodeNumber = neighbourRow * m + neighbourCol;

                        if (ds.findParent(nodeNumber) != ds.findParent(adjNodeNumber)){
                            count--;
                            ds.unionBySize(nodeNumber, adjNodeNumber);
                        }
                    }
                }
            }
            answer.add(count);
        }
        return answer;
    }

// check validation
    private boolean isValid(int neighbourRow, int neighbourCol, int n, int m) {
        return neighbourRow >= 0 && neighbourRow < n && neighbourCol >= 0 && neighbourCol < m;
    }

    public static void main (String[] args) {
        int n = 4, m = 5;
        int[][] operators = {{0, 0}, {0, 0}, {1, 1}, {1, 0}, {0, 1},
                {0, 3}, {1, 3}, {0, 4}, {3, 2}, {2, 2}, {1, 2}, {0, 2}
        };

        NumberOfIslands2 obj = new NumberOfIslands2(operators.length);
        List<Integer> ans = obj.numOfIslands(n, m, operators);

        int sz = ans.size();
        for (int i = 0; i < sz; i++) {
            System.out.print(ans.get(i) + " ");
        }
        System.out.println("");
    }
}
