package STRIVER_SHEET.ARRAYS;

public class SecondLargestElementInArray {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        System.out.println(secondLargest(arr));
    }

    static int secondLargest(int[] arr){
        int largest = Integer.MIN_VALUE;
        int secondLargest = largest;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            }
        }
        return secondLargest;
    }

}
