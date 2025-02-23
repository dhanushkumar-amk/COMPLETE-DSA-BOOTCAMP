package DYNAMIC_PROGRAMMING.BASED_ON_PARTITION;


// https://leetcode.com/problems/minimum-cost-to-cut-a-stick/description/
// leetcode 1547

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MinimumCostToCutAStick {


    public static void main(String[] args) {
        MinimumCostToCutAStick answer = new MinimumCostToCutAStick();

        ArrayList<Integer> cuts = new ArrayList<>(Arrays.asList(3, 5, 1, 4));
        int c = cuts.size();
        int n = 7;

        System.out.println("The minimum cost incurred: " + answer.cost(n, c, cuts));
    }

    public int cost(int n, int c, ArrayList<Integer> cuts) {

        // add 0 and n on both front and back
        cuts.add(0);
        cuts.add(n);

        // sort the array
        Collections.sort(cuts);

        int[][] dp = new int[n][n];

        for(int[] row : dp)
            Arrays.fill(row, -1);

        return function(1 ,c,cuts, dp);
    }

  private  int function(int i ,int j, ArrayList<Integer> cuts, int[][] dp){

        // base case
        if (i > j)
            return 0;

      if (dp[i][j] != -1) {
          return dp[i][j];
      }

        int minimumCuts = Integer.MAX_VALUE;

      for (int index = i; index <= j ; index++) {
          int answer = cuts.get(j + 1) - cuts.get(i - 1) +
                  function(i, index -1, cuts, dp)
                  + function(index + 1,j, cuts, dp);

          minimumCuts = Math.min(minimumCuts, answer);
      }
    return dp[i][j] =  minimumCuts;
    }

}
