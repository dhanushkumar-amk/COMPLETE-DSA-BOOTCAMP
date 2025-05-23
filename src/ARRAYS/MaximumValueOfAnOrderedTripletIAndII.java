package ARRAYS;


// leetcode 2873 && 2874 both has same answer
// https://leetcode.com/problems/maximum-value-of-an-ordered-triplet-i/
// https://leetcode.com/problems/maximum-value-of-an-ordered-triplet-ii/

public class MaximumValueOfAnOrderedTripletIAndII {

    public static void main(String[] args) {
        MaximumValueOfAnOrderedTripletIAndII answer = new MaximumValueOfAnOrderedTripletIAndII();
        int[] nums ={12,6,1,2,7};

        System.out.println(answer.maximumTripletValue(nums));
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
