package MATRIX;

// leetcode 2033
// https://leetcode.com/problems/minimum-operations-to-make-a-uni-value-grid/description/?envType=daily-question&envId=2025-03-26

import java.util.ArrayList;
import java.util.List;

public class MinimumOperationsToMakeAUniValueGrid {


    public static void main(String[] args) {

    }

    public int minOperations(int[][] grid, int x) {

        List<Integer> oneDArray = new ArrayList<>();
        int remainder = grid[0][0] % x;

        // convert matrix into a 1D array
        for (int i = 0; i < grid.length; ++i) {
            for (int j = 0; j < grid[0].length; ++j) {
                if (grid[i][j] % x != remainder)
                    return -1;
                
            }
        }

    }


}
