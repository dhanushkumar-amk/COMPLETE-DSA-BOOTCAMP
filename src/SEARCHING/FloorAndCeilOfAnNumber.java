package SEARCHING;

public class FloorAndCeilOfAnNumber {
    public static void main(String[] args) {
        int[] arr = {19,23,56,58,78,79,84,89,99};
        int target  = 80;
        System.out.println(ceil(arr, target));
        System.out.println(floor(arr, target));

    }

     static int ceil(int[] arr, int target){
        int low = 0;
        int high = arr.length -1;

        while(low <= high){
            int mid = (low + high)/2;

            if (arr[mid] == target )
                return arr[mid];

            if (target < arr[mid])
                high = mid -1;
            else
                low = mid + 1;
        }

        return arr[low];


     }
     static int floor(int[] arr, int target){

         int low = 0;
         int high = arr.length -1;

         while(low <= high){
             int mid = (low + high)/2;

             if (arr[mid] == target )
                 return arr[mid];

             if (target < arr[mid])
                 high = mid -1;
             else
                 low = mid + 1;
         }

         return arr[high];
     }

}
