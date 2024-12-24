package RECURSION;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {22,33,44,55,66,77,88,99};
        int target = 55;
        System.out.println(search(arr, target, 0, arr.length-1));
    }
    static int search(int[] arr, int target, int start, int end){

        // base case
        if (start > end)
            return -1;

        int mid = (start + end)/2;

        if (target == arr[mid])
            return mid;

        if (target > arr[mid])
            return search(arr, target, mid + 1, end);
        else
            return search(arr, target, start, mid - 1);

    }
}
