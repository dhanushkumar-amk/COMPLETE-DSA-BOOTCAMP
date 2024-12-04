package ARRAYS;

public class SecondSmallestNumber {
    public static void main(String[] args) {
        int[] arr = {23, 24, 25, 26, 27, 28};
        System.out.println(secondSmallest(arr));
    }

    static int secondSmallest(int[] arr) {
        int min1 = Integer.MAX_VALUE; // Initialize min1 to the largest possible value
        int min2 = Integer.MAX_VALUE; // Initialize min2 to the largest possible value

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min1) {
                min2 = min1; // The previous min1 becomes the second smallest
                min1 = arr[i]; // Update min1 to the new smallest value
            } else if (arr[i] < min2 && arr[i] != min1) {
                min2 = arr[i]; // Update min2 if arr[i] is smaller than min2 and not equal to min1
            }
        }
        return min2; // Return the second smallest number
    }
}
