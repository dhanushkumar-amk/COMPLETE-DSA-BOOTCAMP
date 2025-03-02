package GREEDY;

// leetcode : 134
// https://leetcode.com/problems/gas-station/

public class GasStation {

    public static void main(String[] args) {
        int[] gas = {1,2,3,4,5}l;
        int[] cost = 
    }

    public static int canCompleteCircuit(int[] gas, int[] cost) {

        int totalGas = 0;
        int totalCost = 0;
        int startIndex = 0;
        int tank = 0;

        for (int i = 0; i < gas.length; i++) {
            totalGas += gas[i];
            totalCost += cost[i];
            tank += gas[i] - cost[i];

            if (tank < 0){
                startIndex = i + 1;
                tank = 0;
            }
        }

        if (totalGas < totalCost)
            return -1;

        return startIndex;
    }

}
