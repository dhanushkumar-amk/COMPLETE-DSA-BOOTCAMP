package STRIVER_SHEET.ARRAYS;

public class RotateTheArrayByDPlaces {
    public static void main(String[] args) {

    }

    public void rotate(int[] arr, int k) {
        int n = arr.length;
        // Reverse first n-k elements
        Reverse(arr, 0, n - k - 1);
        // Reverse last k elements
        Reverse(arr, n - k, n - 1);
        // Reverse whole array
        Reverse(arr, 0, n - 1);
    }

    static void Reverse(int[] arr, int start, int end){
        while(start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

}
