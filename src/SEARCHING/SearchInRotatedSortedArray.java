package SEARCHING;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,8,9,1,2,3};
        int target = 8;
        System.out.println(search(arr, target));

    }
    static int search(int[] arr, int target){
        int low = 0;
        int high = arr.length - 1;
        int mid = 0;

        while(low <= high){
            mid = (low + high)/2;

            if(target == arr[mid]){
                return mid;
            }
            // left portion of array
            else if(arr[low] <= arr[mid]) {
                if (target >= arr[low] && target < arr[mid])
                    high = mid -1;
                else
                    low = mid + 1;
            }

            // right portion of array
            else{
                if (target > arr[mid] && target <= arr[high])
                    low = mid + 1;
                else
                    high = mid - 1;
            }
        }
        return  -1;
    }
}
