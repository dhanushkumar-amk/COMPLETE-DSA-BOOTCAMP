package ARRAYS;

// leetcode : 2780
// https://leetcode.com/problems/minimum-index-of-a-valid-split/description/?envType=daily-question&envId=2025-03-27

import java.util.*;

public class MinimumIndexOfAValidSplit {

    public int minimumIndex(List<Integer> nums) {


    }


    private int mooresVotingAlgo(List<Integer> nums) {
        int majority_element = nums.get(0);
        int freq = 1;
        for (int i = 1; i < nums.size(); ++i) {
            if (nums.get(i) != majority_element) {
                freq--;
            } else {
                freq++;
            }
            if (freq == 0) {
                majority_element = nums.get(i);
                freq = 1;
            }
        }
        return majority_element;
    }

}
