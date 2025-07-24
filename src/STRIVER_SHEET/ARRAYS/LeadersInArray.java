package STRIVER_SHEET.ARRAYS;

import java.util.ArrayList;
import java.util.Collections;

public class LeadersInArray {
    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        ArrayList<Integer> ans = leaders(arr);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
    }

    public static ArrayList<Integer> leaders(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        int n = arr.length;
        for (int i = n - 1; i > 0 ; i--) {
            if(arr[i] > max){
                ans.add(arr[i]);
            }
            max = Math.max(arr[i], max);
        }
//        Collections.sort(ans);
        return ans;
    }
}
