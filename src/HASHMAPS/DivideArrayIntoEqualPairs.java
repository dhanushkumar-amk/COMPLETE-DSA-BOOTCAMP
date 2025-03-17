package HASHMAPS;

// leetcode 2206
// https://leetcode.com/problems/divide-array-into-equal-pairs/description/?envType=daily-question&envId=2025-03-17

import java.util.HashSet;
import java.util.Set;

public class DivideArrayIntoEqualPairs {

    public static void main(String[] args) {
        DivideArrayIntoEqualPairs answer = new DivideArrayIntoEqualPairs();
            int[] nums = {3,2,3,2,2,2};
        System.out.println(answer.divideArray(nums));
    }

    public boolean divideArray(int[] nums) {

        Set<Integer> setPairs = new HashSet<>();

        for(int element : nums){
            if (setPairs.contains(element))
                setPairs.remove(element);
            else
                setPairs.add(element);
        }

        if (setPairs.isEmpty())
            return true;
        return false;
    }
}
