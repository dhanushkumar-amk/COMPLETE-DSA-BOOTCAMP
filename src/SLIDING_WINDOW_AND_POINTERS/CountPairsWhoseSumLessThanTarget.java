package SLIDING_WINDOW_AND_POINTERS;

// leetcode 2824
// https://leetcode.com/problems/count-pairs-whose-sum-is-less-than-target/description/


import java.util.List;

public class CountPairsWhoseSumLessThanTarget {
    public static void main(String[] args) {

    }

    public int countPairs(List<Integer> nums, int target) {

        int sum = 0;

        for (int i = 0; i < nums.size();i++) {
            for (int j = i + 1; j < nums.size(); j++) {
                if (nums.get(i) + nums.get(j) < target)
                    sum++;
            }
        }

        return sum;
    }


}