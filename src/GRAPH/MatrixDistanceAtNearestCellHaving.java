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

        int[] deltaRow = {-1, 0, 1, 1};
        int[]  deltaCol = {0,1, 0, -1};

        while (!queue.isEmpty()){
            int row = queue.peek().first;
            int col = queue.peek().second;
            int steps = queue.peek().third;
            queue.remove();

            distance[row][col] = steps;


            for (int i = 0; i <4; i++) {
                int neighbourRow = row + deltaRow[i];
                int neighbourCol = col + deltaCol[i];


                if (neighbourRow >= 0 && neighbourRow < n && neighbourCol >= 0 && neighbourCol < m && visited[neighbourRow][neighbourCol] == 0){
                    visited[neighbourRow][neighbourCol] = 1;
                    queue.add(new Node(neighbourRow, neighbourCol, steps + 1));
                }
            }
        }
        return distance;
    }


    public static void main(String[] args)
    {
        int[][] grid = {
                {0,1,1,0},
                {1,1,0,0},
                {0,0,1,1}
        };

        MatrixDistanceAtNearestCellHaving obj = new MatrixDistanceAtNearestCellHaving();
        int[][] ans = obj.updateMatrix(grid);
        for(int i = 0; i < ans.length; i++){
            for(int j = 0; j < ans[i].length; j++){
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }



}
