package SEARCHING;

import java.util.Arrays;

public class MaximumCandiesAllocatedToKChildren {

    public static void main(String[] args) {
        MaximumCandiesAllocatedToKChildren answer = new MaximumCandiesAllocatedToKChildren();

        int[] candies = {5,8,6};
        int k = 3;

        System.out.println(answer.maximumCandies(candies,k));
    }

    public int maximumCandies(int[] candies, long k) {

        int low = 0;
        int high = Arrays.stream(candies).max().getAsInt();
        int mid;

        int maxCandies = 0;

        while (low <= high){
            mid = low + (high - low)/2;

            if (canAssign(mid, candies, k)){
                low = mid + 1;
                maxCandies = mid;
            }
            else{
                high = mid - 1;
            }
        }
        return maxCandies;
    }

    private boolean canAssign(int mid, int[] candies, long k) {
        int count = 0;

        for(int candie : candies){
            if (candie >= mid)
                count += candie/mid;
        }
        return count >= k;
    }
}
