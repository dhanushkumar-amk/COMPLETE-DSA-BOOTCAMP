package DYNAMIC_PROGRAMMING.BASED_ON_PARTITION;


// https://leetcode.com/problems/minimum-cost-to-cut-a-stick/description/
// leetcode 1547

import java.util.ArrayList;

public class MinimumCostToCutAStick {

    static int cost(int n, int c, ArrayList<Integer> cuts) {

        return function(n,c,cuts);
    }

    int function(int n,int c, ArrayList<Integer> cuts ){

        cuts.add(n);

    }

}
