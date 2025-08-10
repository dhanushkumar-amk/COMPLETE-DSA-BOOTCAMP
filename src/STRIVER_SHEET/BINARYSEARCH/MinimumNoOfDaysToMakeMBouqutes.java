package STRIVER_SHEET.BINARYSEARCH;

public class MinimumNoOfDaysToMakeMBouqutes {

    // Helper function
    static boolean isPossible(int[] arr, int m, int k, int mid) {
        int flowersTogether = 0;
        int bouquetCount = 0;

        for (int day : arr) {
            if (day <= mid) {
                flowersTogether++;
                if (flowersTogether == k) {
                    bouquetCount++;
                    if (bouquetCount == m) return true;
                    flowersTogether = 0;
                }
            } else {
                flowersTogether = 0;
            }
        }
        return false;
    }

    // Main function logic
    public static int minDaysBloom(int[] arr, int k, int m) {
        if ((long) m * k > arr.length) return -1;

        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;

        for (int day : arr) {
            low = Math.min(low, day);
            high = Math.max(high, day);
        }

        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isPossible(arr, m, k, mid)) {
                result = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    // Test from main()
    public static void main(String[] args) {
        int[] arr = {1, 10, 3, 10, 2};
        int k = 3;
        int m = 1;

        int ans = minDaysBloom(arr, k, m);
        System.out.println("Minimum Days: " + ans);
    }
}
