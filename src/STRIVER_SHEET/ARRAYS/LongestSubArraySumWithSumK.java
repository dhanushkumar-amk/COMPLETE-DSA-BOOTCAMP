package STRIVER_SHEET.ARRAYS;

public class LongestSubArraySumWithSumK {
    public static void main(String[] args) {
    int[] arr = {1,2,3,1,1,1,3,3};
    int k = 6;
        System.out.println(longestSubarraySum(arr, k));
    }

    static long longestSubarraySum(int[] arr, int k ){
        int left = 0;
        int right = 0;

        long sum = arr[0];
        int max = 0;
        int n = arr.length;


        while (right < n){

            while (sum > k){
                sum -= arr[left];
                left++;
            }
            if(sum == k){
                max = Math.max(max, right - left + 1);
            }
            right++;
            if(right < n)
                sum += arr[right];
        }
        return max;
    }


}
