package BITMANUPULATION;

import java.util.Arrays;

public class LonelyDigits {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,3,2,4,5,1};
        System.out.println(lonelyInteger2(arr));
    }

    // method 1
    public  static  int lonelyInteger1(int[] arr){
        Arrays.sort(arr);
        for (int i = 0; i <arr.length-1 ; i+= 2) {
            if (arr[i] != arr[i + 1])
                return arr[i];
        }
        return arr[arr.length-1];
    }


    // method 2
    public static int lonelyInteger2(int[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++)
            result = result ^ arr[i];

        return result;
    }

}
