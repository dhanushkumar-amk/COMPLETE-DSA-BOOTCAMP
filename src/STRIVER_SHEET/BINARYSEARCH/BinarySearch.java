package STRIVER_SHEET.BINARYSEARCH;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {4,77,88,99,234,345,456};
        System.out.println(binarySearch(arr, 234));
    }

    public static int binarySearch(int[] arr, int target){
        int low = 0;
        int high = arr.length - 1;
            while (low <= high) {
                int mid = (low + high) / 2;
                if (arr[mid] == target) return mid;
                else if (target > arr[mid]) low = mid + 1;
                else high = mid - 1;
        }
        return -1;
    }
}
