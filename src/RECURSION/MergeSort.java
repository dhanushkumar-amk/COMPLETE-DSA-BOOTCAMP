package RECURSION;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {22,44,11,66,33,919,111};
        System.out.println(Arrays.toString(mergeSort(arr)));
    }

    static  int[] mergeSort(int[] arr){

        if (arr.length == 1)
            return arr;

        int mid = arr.length / 2;

        int[] left =  mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    private static  int[] merge(int[] left, int[] right){

        int[] result = new int[left.length + right.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < left.length && j < right.length){
            if (left[i] < right[j]){
                result[k] = left[i];
                i++;
                k++;
            }
            else{
                result[k] = right[j];
                j++;
                k++;
            }
        }

        // if i is not finish
        while (i < left.length){
            result[k] = left[i];
            i++;
            k++;
        }

//        else if j is not finish
        while(j < right.length){
            result[k] = right[j];
            j++;
            k++;
        }

        return result;
    }



    // merge sort with in place
    
}
