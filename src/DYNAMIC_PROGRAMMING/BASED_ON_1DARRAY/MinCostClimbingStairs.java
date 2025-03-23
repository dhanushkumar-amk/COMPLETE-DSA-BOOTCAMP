package DYNAMIC_PROGRAMMING.BASED_ON_1DARRAY;


// leetcode :746
// https://leetcode.com/problems/min-cost-climbing-stairs/description/


public class MinCostClimbingStairs {


    public static void main(String[] args) {
        MinCostClimbingStairs answer = new MinCostClimbingStairs();
        int[] cost = {10,15,20};
        System.out.println(answer.minCostClimbingStairs(cost));
    }

    public int minCostClimbingStairs(int[] cost) {

        int n = cost.length;
        int[] minCost = new int[n + 1];

        for (int i =  2; i <= n; i++) {
            minCost[i] = Math.min(cost[i - 1] + minCost[i - 1], cost[i - 2] + minCost[i - 2]);
        }
        return minCost[n];
    }
}
