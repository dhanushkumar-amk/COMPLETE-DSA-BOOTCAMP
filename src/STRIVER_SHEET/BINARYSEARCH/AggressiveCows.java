package STRIVER_SHEET.BINARYSEARCH;

import java.util.Arrays;

public class AggressiveCows {
    public static void main(String[] args) {
        int[] stalls = {1, 2, 4, 8, 9};
        int k = 3;
        System.out.println(aggressiveCows(stalls, k));
    }

    public static int aggressiveCows(int []stalls, int k) {
        Arrays.sort(stalls);
        int n = stalls.length;

        int low = 1;
        int high = stalls[n - 1] - stalls[0];

        while(low <= high){
            int mid = (low + high)/2;

            if(canWePlace(stalls, mid, k))
                low = mid + 1;
            else
                high = mid - 1;
        }
        return high;
    }

    private static boolean canWePlace(int[] stalls, int mid, int k) {
        int countCows = 1;
        int lastlyPlacedCow = stalls[0];

        for (int i = 1; i < stalls.length - 1; i++) {
            if(stalls[i] - lastlyPlacedCow >= mid){
                countCows++;
                lastlyPlacedCow = stalls[i];
            }

            if(countCows >= k)
                return true;
        }
        return false;
    }
}
