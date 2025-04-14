package ARRAYS;


// leetcode 1534
// https://leetcode.com/problems/count-good-triplets/description/?envType=daily-question&envId=2025-04-14

public class CountGoodTriplets {


    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int n = arr.length;
        int answer = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (
                            Math.abs(arr[i] - arr[j]) <= a
                          && Math.abs(arr[j] - arr[k]) <= b
                          && Math.abs(arr[i] - arr[k]) <= c
                    )
                        answer++;
                }
            }
        }
    return answer;
    }
}
