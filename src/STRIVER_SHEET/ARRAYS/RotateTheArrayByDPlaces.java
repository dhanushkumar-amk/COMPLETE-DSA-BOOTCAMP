package STRIVER_SHEET.ARRAYS;

public class RotateTheArrayByDPlaces {
    public static void main(String[] args) {

    }

    public void rotate(int[] nums, int k) {
        
    }

    static void reverse(int[] arr, int start, int end){
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

}
