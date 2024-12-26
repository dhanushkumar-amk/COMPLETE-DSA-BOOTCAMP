package ARRAYS;

import java.util.Arrays;

public class ReverseArrayAndRemoveDuplicates {

    public static void main(String[] args) {


        int[] arr = {1, 2, 3, 3, 4, 5, 6, 6};

        reverse(arr);

        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        int ans = removeDuplicates(arr);
        for (int i = ans; i >=0  ; i--) {
            System.out.print(arr[i] + " ");
        }

        reverse(arr);

    }






    static  int removeDuplicates(int[] arr){

        Arrays.sort(arr);

        int j=0;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] != arr[j]) { // Only add unique elements
                    j++;
                    arr[j] = arr[i];
                }
            }
            return j + 1;
    }

     static void reverse(int[] arr){
        int start = 0;
        int end = arr.length -1;

        while (start <= end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
     }
}


