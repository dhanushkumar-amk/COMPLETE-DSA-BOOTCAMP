package SEARCHING;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {12,14,15,17,18};
        int target = 14;
        System.out.println(binarySearch(arr, target));
    }


    static  int binarySearch(int[] arr, int target){


        int low = 0;
         int high = arr.length -1;

         while(low <= high){
             int mid = (low + high)/2;

             if (arr[mid] == target)
                 return mid;

             if (target <  arr[mid])
                 high = mid -1;
             else
                 low = mid + 1;

         }

        return -1;
    }

}
