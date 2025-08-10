package STRIVER_SHEET.BINARYSEARCH;

import java.util.Arrays;

public class KOKOEatingBananas {
    public static void main(String[] args) {
        int[] arr = {3, 6, 7, 11};
        System.out.println(minEatingSpeed(arr, 8)); // Expected 4

        int[] arr2 = {805306368, 805306368, 805306368};
        System.out.println(minEatingSpeed(arr2, 1_000_000_000)); // Expected 3
    }

    public static int minEatingSpeed(int[] arr, int h) {
        int maxElementInArray = Arrays.stream(arr).max().getAsInt();
        int low = 1, high = maxElementInArray, ans = maxElementInArray;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int totalHour = calculateTotalHours(arr, mid);
            if (totalHour <= h) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    private static int calculateTotalHours(int[] arr, int k) {
        int totalHours = 0;
        for (int num : arr) {
            totalHours += (int) Math.ceil((double) num / k);
        }
        return totalHours;
    }
}
