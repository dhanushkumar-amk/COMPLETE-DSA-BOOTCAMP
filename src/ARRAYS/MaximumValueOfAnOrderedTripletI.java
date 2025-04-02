package ARRAYS;


// leetcode 2873 && 2874 both has same answer
// https://leetcode.com/problems/maximum-value-of-an-ordered-triplet-i/?envType=daily-question&envId=2025-04-02

public class MaximumValueOfAnOrderedTripletI {

    public static void main(String[] args) {
        
    }

    public long maximumTripletValue(int[] nums) {
        long maxTriplet = 0, maxElement = 0, maxDiff = 0;
        for (int num : nums) {
            maxTriplet = Math.max(maxTriplet, maxDiff * num);
            maxDiff = Math.max(maxDiff, maxElement - num);
            maxElement = Math.max(maxElement, num);
        }
        return maxTriplet;
    }

}
