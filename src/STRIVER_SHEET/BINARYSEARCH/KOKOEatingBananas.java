package STRIVER_SHEET.BINARYSEARCH;

import java.util.Arrays;

public class KOKOEatingBananas {
    public static void main(String[] args) {
        int[] arr = {3,6,7,11};
        System.out.println(minEatingSpeed(arr, 8));
    }

    public static int minEatingSpeed(int[] arr, int h) {
        int maxElementInArray = Arrays.stream(arr).max().getAsInt();

        return -1;
    }
}
