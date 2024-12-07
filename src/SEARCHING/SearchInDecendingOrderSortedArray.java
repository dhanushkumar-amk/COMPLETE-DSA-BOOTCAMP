package SEARCHING;

public class SearchInDecendingOrderSortedArray {
    public static void main(String[] args) {
        int[] arr = {88,77,66,55,44,33,22,11,1};
        int target = 66;
        System.out.println(search(arr, target));
    }

    static int search(int[] arr, int target){

        int low = 0;
        int high = arr.length-1;

        while (low<= high){
         int mid = (low + high)/2;

         if (target == arr[mid])
             return mid;

         if (target < arr[mid])
             low = mid + 1;
         else
             high = mid - 1;

        }
        return -1;
    }


}
