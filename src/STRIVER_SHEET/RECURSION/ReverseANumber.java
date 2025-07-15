package STRIVER_SHEET.RECURSION;


import java.util.Arrays;

public class ReverseANumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        reverse(0, arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int index, int[] arr, int n){
        if(index >= n / 2)
            return;

        int temp = arr[index];
        arr[index] =  arr[n - index - 1];
        arr[n - index - 1] = temp;

        reverse(index + 1, arr, n);
    }
}
