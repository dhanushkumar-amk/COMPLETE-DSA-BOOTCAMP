package DYNAMIC_PROGRAMMING.BASED_ON_PARTITION;


// https://leetcode.com/problems/minimum-cost-to-cut-a-stick/description/
// leetcode 1547

import java.util.ArrayList;
import java.util.Collections;

public class MinimumCostToCutAStick {

    public int cost(int n, int c, ArrayList<Integer> cuts) {

        // add 0 and n on both front and back
        cuts.add(0);
        cuts.add(n);

        // sort the array
        Collections.sort(cuts);

        return function(1 ,c,cuts);
    }

  private  int function(int i ,int j, ArrayList<Integer> cuts ){

        // base case
        if (i > j)
            return 0;

        int minimumCuts = Integer.MAX_VALUE;

      for (int index = i; index <= j ; index++) {
          
      }

    }

}
