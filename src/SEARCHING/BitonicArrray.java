package SEARCHING;

public class BitonicArrray {
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9,10,3,2,1};
        int target = 8;
        int BitonicIndex = bitonicPoint(arr);

        System.out.println(searchBitonic(arr, target, BitonicIndex));
    }

    static  int ascendingBinarySearch(int[] arr, int target, int range){
        int low = 0;
        int high = range;

        while (low <= high){
            int mid = (low + high)/2;

            if (target == mid)
                return mid;

            if (target < arr[mid])
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }


    // just interchange the conditions
    static  int descendingBinarySearch(int[] arr, int target, int range){
        int low = range;
        int high = arr.length -1;

        while (low <= high){
            int mid = (low + high)/2;

            if (target == mid)
                return mid;

            if (target < arr[mid])
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }


    static int bitonicPoint(int[] arr){

        int left = 0;
        int right = arr.length -1;

        while(left <= right){
            int mid = (left + right)/2;

            if (arr[mid] > arr[mid -1 ] && arr[mid] > arr[mid + 1])
                return mid;
            else if (arr[mid] > arr[mid - 1] && arr[mid] < arr[mid - 1])
                left = mid;
            else
                right = mid;
        }
        return -1;
    }


    static int searchBitonic(int[] arr, int target, int BitonicIndex){


        if (target == BitonicIndex){
            return BitonicIndex;
        }

        if(target > arr[BitonicIndex]) return -1;


        int result1 =  ascendingBinarySearch(arr, target, BitonicIndex - 1);
        if (result1 != -1)return result1;

        int result2 = descendingBinarySearch(arr, target, BitonicIndex + 1);
        if (result2 != -1) return result2;

        return -1;
    }
}
