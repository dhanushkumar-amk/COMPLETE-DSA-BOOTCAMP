package STRIVER_SHEET.HASHMAP;

import java.util.HashMap;
import java.util.Map;

public class HighestAndLowestFrequencyElements {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1,2,2,2,2,2,2,3,4,4,4};
        freq(arr);
    }

    static void freq(int[] arr) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();


        for (int num : arr) {
            hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);
        }

        int maxFreq = Integer.MIN_VALUE;
        int minFreq = Integer.MAX_VALUE;
        int maxElement = -1;
        int minElement = -1;


        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            int key = entry.getKey();
            int val = entry.getValue();

            if (val > maxFreq) {
                maxFreq = val;
                maxElement = key;
            }

            if (val < minFreq) {
                minFreq = val;
                minElement = key;
            }
        }

        System.out.println("Element with Highest Frequency: " + maxElement + " (Count: " + maxFreq + ")");
        System.out.println("Element with Lowest Frequency: " + minElement + " (Count: " + minFreq + ")");
    }
}
