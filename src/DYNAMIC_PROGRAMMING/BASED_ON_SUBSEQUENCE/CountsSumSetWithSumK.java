package DYNAMIC_PROGRAMMING.BASED_ON_SUBSEQUENCE;

public class CountsSumSetWithSumK {

    public static void main(String args[]) {
        int arr[] = {1, 2, 2, 3};
        int k = 3;

        // Calculate and print the number of subsets that sum up to k
        System.out.println("The number of subsets found are " + findWays(arr, k));
    }
}
