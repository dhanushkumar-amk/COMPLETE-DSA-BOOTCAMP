package STRIVER_SHEET.ARRAYS;

public class SecondLargestElementInArray {
    public static void main(String[] args) {
        int[] arr = {17,19, 57, 43,55, 36,47,98};
        System.out.println(secondLargest(arr));
    }

    static int secondLargest(int[] arr){
        int largest = Integer.MIN_VALUE;
        int secondLargest = largest;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > largest){
                secondLargest = arr[i];
                largest = arr[i];
            }
        }
        return secondLargest;
    }

}
