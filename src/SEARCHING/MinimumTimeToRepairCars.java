package SEARCHING;

// leetcode: 2594
// https://leetcode.com/problems/minimum-time-to-repair-cars/description/?envType=daily-question&envId=2025-03-16


import java.util.Arrays;
import java.util.Map;

public class MinimumTimeToRepairCars {

    public static void main(String[] args) {

        MinimumTimeToRepairCars answer = new MinimumTimeToRepairCars();

        int[] ranks = {4,3,2,1};
        int cars = 10;

        System.out.println(answer.repairCars(ranks, cars));

    }

    public long repairCars(int[] ranks, int cars) {

        long n = ranks.length;
        long low = 1; // 1 rank and 1 car;
        long high = (long)Arrays.stream(ranks).min().getAsInt() * cars * cars;

        long answer = 0;

        while (low <= high){
            long mid = low + (high - low) / 2;
            if (canAssign(mid, ranks, cars)){
                answer = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return answer;
    }

    private boolean canAssign(long mid, int[] ranks, int cars) {
        long count = 0;

        for (long rank : ranks)
            count += (long) Math.sqrt(mid / rank);

        return count >= cars;
    }
}
