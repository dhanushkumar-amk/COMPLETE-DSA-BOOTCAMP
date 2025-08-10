package STRIVER_SHEET.BINARYSEARCH;

import java.util.Arrays;

public class KOKOEatingBananas {
    public static void main(String[] args) {
        int[] arr = {3,6,7,11};
        System.out.println(minEatingSpeed(arr, 8));
    }

    public static int minEatingSpeed(int[] arr, int h) {
        int maxElementInArray = Arrays.stream(arr).max().getAsInt();

        int low = 1;
        int high = maxElementInArray;
        int ans = 0;

        while (low <= high){
            int mid = (low + high)/2;
            int totalHour = calculateTotalHours(arr, mid);

            if(totalHour <= h){
                ans = mid;
                high = mid - 1;
            }
            else
                low = mid + 1;
        }
        return ans;
    }

    private static int calculateTotalHours(int[] arr, int mid) {
        int totalHours =0;
        for (int i = 0; i < arr.length; i++) {
            totalHours += Math.ceil(arr[i]/ mid);
        }
        return totalHours;
    }
}
