package STRIVER_SHEET.ARRAYS;

public class LargestElementInArray {
    public static void main(String[] args) {
        int[] arr = {2,5,1,3,9,7,10,2,5,6};
        System.out.println(largest(arr));
    }

    static int largest(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max)
                max = arr[i];
        }
        return max;
    }

}
