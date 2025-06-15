package SEARCHING;

import java.util.Arrays;

public class SmallestDivisor {
    public static void main(String[] args) {
        SmallestDivisor ans = new SmallestDivisor();

    }

        int smallestDivisor(int[] arr, int k) {
            int low = 1;
            int high = Integer.MIN_VALUE;
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] > high)
                    high
            }

            while (low <= high){
                int mid = low + high / 2;

                if(sumByDiv(arr, mid) <= k){
                    high = mid - 1;
                }
                else{
                    low = mid + 1;
                }
            }
            return low;
        }

        private int sumByDiv(int[] arr, int mid) {
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum += Math.ceil((double) arr[i] / (double) mid);
            }
            return sum;
        }


}
