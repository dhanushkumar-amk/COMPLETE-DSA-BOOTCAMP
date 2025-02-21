package DYNAMIC_PROGRAMMING.BASED_ON_SUBSEQUENCE;

import javax.xml.transform.stax.StAXResult;

public class UnboundedKnapsack {


    public static void main(String[] args) {
        int wt[] = { 2, 4, 6 };
        int val[] = { 5, 11, 13 };
        int W = 10;

        int n = wt.length;

        // Call the unboundedKnapsack function and print the result
        System.out.println("The Maximum value of items, the thief can steal is " + unbounded(n, W, val, wt));
    }

    static int function(int index, int bagWeight, int[] value, int[] weight){

        if (index == 0){
            return ( (int) (bagWeight/ weight[0])) * value[0];
        }

        int notPick = function(index - 1, bagWeight, value, weight);

        int pick = 0;

        if (weight[index] <= bagWeight)
            pick = value[index] +  function(index, bagWeight - weight[index], value, weight);

        return pick + notPick;
    }

    static  int unbounded(int n, int bagWeight, int[] value, int[] weight){
         return function(n - 1, bagWeight, value, weight);
    }
}
