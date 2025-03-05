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
}
