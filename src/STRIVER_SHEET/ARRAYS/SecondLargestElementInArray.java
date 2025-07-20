package STRIVER_SHEET.ARRAYS;

public class SecondLargestElementInArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
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
