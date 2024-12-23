package RECURSION;

public class SubSetSum {
    public static void main(String[] args) {

        int[] arr = {10,20,1,5};
        int sum = 25;

        System.out.println(countSubSets(arr, sum, 0));
    }

    static int countSubSets(int[] arr, int sum, int i){

        // base case
        if (sum < 0)
            return 0;

        if (sum == 0)
            return 1;

        if (i == arr.length)
            return 0;

        return countSubSets(arr, sum - arr[i], i++) + countSubSets(arr, sum, i++);

    }
}
