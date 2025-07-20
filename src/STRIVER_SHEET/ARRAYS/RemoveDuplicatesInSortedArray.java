package STRIVER_SHEET.ARRAYS;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesInSortedArray {
    public static void main(String[] args) {
        int[] arr = {4,4, 6,7,8,9,9,10};
        int range = removeDuplicates(arr);
        for (int i = 0; i < range; ++i) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        ArrayList<Integer> ans = removeDuplicates1(arr);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
    }

    static int removeDuplicates(int[] arr){
        int i = 0;
        for (int j = 1; j < arr.length; ++j) {
            if(arr[i] != arr[j]){
                arr[i + 1]  = arr[j];
                i++;
            }
        }
        return i + 1;
    }

    static ArrayList<Integer> removeDuplicates1(int[] arr) {
        int i = 0;
        int count = 0;
        for (int j = 1; j < arr.length; ++j) {
            if(arr[i] != arr[j]) {
                arr[i + 1] = arr[j];
                i++;
                count++;
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();
        int inner = 0;
        for (int j = 0; j <= i; j++) {
            if(inner <= count) {
                ans.add(arr[j]);
            }
            else break;
        }
        return ans;
    }

}