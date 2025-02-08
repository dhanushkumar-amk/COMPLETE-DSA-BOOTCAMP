package GRAPH;


// https://leetcode.com/problems/01-matrix/description/
//leetcode 542

import java.util.*;

public class MatrixDistanceAtNearestCellHaving {


    class Node{
        int first;
        int second;
        int third;

        public Node(int first, int second, int third) {
            this.first = first;
            this.second = second;
            this.third = third;
        }
    }



    public int[][] updateMatrix(int[][] mat) {

        int n = mat.length;
        int m = mat[0].length;

        int[][] visited = new int[n][m];
        int[][] distance = new int[n][m];

        Queue<Node> queue = new LinkedList<Node>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 1){
                    queue.add(new Node(i, j, 0));
                    visited[i][j] = 1;
                }
                else{
                    visited[i][j] = 0;
                }
            }
        }

        while (!queue.isEmpty()){
            int row = queue.peek().first;
            int col = queue.peek().second;
            
        }
    }


    public static void main(String[] args)
    {
        int[][] grid = {
                {0,1,1,0},
                {1,1,0,0},
                {0,0,1,1}
        };

        MatrixDistanceAtNearestCellHaving obj = new MatrixDistanceAtNearestCellHaving();
        int[][] ans = obj.nearest(grid);
        for(int i = 0; i < ans.length; i++){
            for(int j = 0; j < ans[i].length; j++){
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }



}
