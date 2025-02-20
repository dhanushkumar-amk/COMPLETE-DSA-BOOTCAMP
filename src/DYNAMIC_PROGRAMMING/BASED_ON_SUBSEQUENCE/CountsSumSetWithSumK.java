package DYNAMIC_PROGRAMMING.BASED_ON_SUBSEQUENCE;

public class CountsSumSetWithSumK {

    public static void main(String args[]) {
        int arr[] = {1, 2, 2, 3};
        int k = 3;

        // Calculate and print the number of subsets that sum up to k
        System.out.println("The number of subsets found are " + findWays1(arr, k));
    }


    // memoization answer
    static int findWays1(int[] arr, int target) {

        

        int startIndex = arr.length;
        return function(startIndex, target, arr);
    }

    static int function(int index, int target, int[] arr){

        if (target == 0)
            return 1;

        if (index == 0){
            if (arr[index] == 0)
                return 1;
            else
                return 0;
        }

        int notPick  = function(index - 1, target, arr);

        int pick = 0;
        if (arr[index] <= target)
            pick = function(index - 1, target - arr[index], arr);

        return pick + notPick;
    }
}
