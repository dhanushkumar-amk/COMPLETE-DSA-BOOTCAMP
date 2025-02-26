package GRAPH;

/// https://leetcode.com/problems/number-of-islands/description/
// leetcode : 200

public class NumberOfIslands {

    public int numIslands(char[][] grid) {

        int n = grid.length;
        int m = grid[0].length;


        // edge case
        if (grid == null || n == 0 || m == 0)
            return 0;

        int count = 0;

        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == '1') {
                    dfs(i, j, grid);
                    count++;
                }
            }
        }
        return count;
    }


    // dfs function
    private  void dfs(int i, int j, char[][] grid){

        // validity check
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == '0')
            return;

        grid[i][j] = '0'; // mark the cell as visited

        // explore all the ways
        dfs(i-1, j, grid);
        dfs(i, j - 1, grid);
        dfs(i+1, j, grid);
        dfs(i, j + 1, grid);

    }

}
