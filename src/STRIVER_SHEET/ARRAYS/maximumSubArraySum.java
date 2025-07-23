package STRIVER_SHEET.ARRAYS;

public class maximumSubArraySum {
    public static void main(String[] args) {
        int[] arr = {1,-2,-5, -10,34};
        System.out.println(subArraySum(arr));
    }

    static int subArraySum(int[] arr){
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; ++i) {

            sum += arr[i];

            if(sum > max)
                max = sum;

            if(sum < 0)
                sum = 0;
        }
        return max;
    }
}
