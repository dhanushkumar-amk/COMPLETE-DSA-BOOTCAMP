package MATRIX;

// leetcode 2033
// https://leetcode.com/problems/minimum-operations-to-make-a-uni-value-grid/description/?envType=daily-question&envId=2025-03-26

import java.util.*;

public class MinimumOperationsToMakeAUniValueGrid {


    public static void main(String[] args) {

    }

    public int minOperations(int[][] grid, int x) {

        List<Integer> oneDArray = new ArrayList<>();
        int remainder = grid[0][0] % x;

        // convert matrix into a 1D array
        for (int i = 0; i < grid.length; ++i) {
            for (int j = 0; j < grid[0].length; ++j) {
                if (grid[i][j] % x != remainder)  // not equal then return -1 because not make a unique values
                    return -1;
                oneDArray.add(grid[i][j]);
            }
        }

        // sort the one D array
        Collections.sort(oneDArray);

        int n = oneDArray.size();
        int middleValue = n / 2;

        // count the steps required
        int steps = 0;
        for (int i = 0; i < n; ++i) {
            steps += Math.abs(oneDArray.get(i) - oneDArray.get(middleValue)) / x;
        }

        return steps;

    }


}
