package MATHS;

// leetcode 3128
// https://leetcode.com/problems/right-triangles/description/

public class RightTriangles {

    public long numberOfRightTriangles(int[][] grid) {

        int n = grid.length;
        int m = grid[0].length;

        int[] rowCount = new int[n];
        int[] colCount = new int[m];

        // count the ones in row
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1)
                    count++;
            }
            rowCount[i] = count; // assign the count total count to the array
        }

        // count the ones in col
        for (int j = 0; j < m; j++) {
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (grid[i][j] == 1)
                    count++;
            }
            colCount[j] = count;
        }

        long answer = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1)
                    answer += (long) (rowCount[i] - 1) * (colCount[j] - 1);
            }
        }
        return  answer;
    }


    /*
    class Solution {
    public long numberOfRightTriangles(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int[] rows = new int[m];
        int[] cols = new int[n];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                rows[i] += grid[i][j];
                cols[j] += grid[i][j];
            }
        }

        long ans = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    ans += (rows[i] - 1) * (cols[j] - 1);
                }
            }
        }

        return ans;
    }
}
     */
}
