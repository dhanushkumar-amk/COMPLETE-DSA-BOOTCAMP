package GRAPH;

// https://leetcode.com/problems/surrounded-regions/description/
//leetcode 130


public class SurroundedRegions {


    static  char[][] fill(int n, int m, char[][] matrix){
        int[] deltaRow = {-1, 0, +1, 0};
        int[] deltaCol = {0, 1, 0, -1};
        int[][] visited = new int[n][m];

        // traverse first row and last row
        for(int j = 0 ; j<m;j++) {
            // check for unvisited Os in the boundary rows
            // first row
            if(visited[0][j] == 0 && matrix[0][j] == 'O') {
                dfs(0, j, visited, matrix, deltaRow, deltaCol);
            }

            // last row
            if(visited[n-1][j] == 0 && matrix[n-1][j] == 'O') {
                dfs(n-1,j,visited,matrix, deltaRow, deltaCol);
            }
        }

        for(int i = 0;i<n;i++) {
            // check for unvisited Os in the boundary columns
            // first column
            if(visited[i][0] == 0 && matrix[i][0] == 'O') {
                dfs(i, 0, visited, matrix, deltaRow, deltaCol);
            }

            // last column
            if(visited[i][m-1] == 0 && matrix[i][m-1] == 'O') {
                dfs(i, m-1, visited, matrix, deltaRow, deltaCol);
            }
        }
        // if unvisited O then convert to X
        for(int i = 0;i<n;i++) {
            for(int j= 0 ;j<m;j++) {
                if(visited[i][j] == 0 && matrix[i][j] == 'O')
                    matrix[i][j] = 'X';
            }
        }

        return matrix;

    }

    private static void dfs(int i, int j, int[][] visited, char[][] matrix, int[] deltaRow, int[] deltaCol) {
    }
}
