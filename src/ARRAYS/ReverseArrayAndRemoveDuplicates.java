package ARRAYS;

public class ReverseArrayAndRemoveDuplicates {

    public static void main(String[] args) {


        int[] arr = {1, 2, 3, 3, 4, 5, 6, 6};

        reverse(arr);

        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }

    }



    static  int removeDuplicates(int[] arr){
        int j=0;

        for (int i = 0; i < arr.length; i++) {

        }
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


