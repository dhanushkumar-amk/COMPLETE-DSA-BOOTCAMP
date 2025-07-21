package STRIVER_SHEET.ARRAYS;

import java.util.ArrayList;
import java.util.Arrays;

public class UnionOfTwoSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1,1,2,3,4,5};
        int[] arr2 = {2,3,4,4,5,6};


    }

    static ArrayList<Integer> FindUnion(int[] arr1, int[] arr2){
        int n1 = arr1.length;
        int n2 = arr2.length;

        int i = 0;
        int j = 0;

        ArrayList<Integer> ans = new ArrayList<>();

        while (i < n1 && j < n2){
            if(arr1[i] <= arr2[j]){
                ans.get(i - 1)
            }
        }

        return ans;
    }


}
