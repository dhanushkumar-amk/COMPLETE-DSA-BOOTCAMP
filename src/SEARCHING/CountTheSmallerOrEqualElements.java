package SEARCHING;

public class CountTheSmallerOrEqualElements {
    public static void main(String[] args) {
//    int[] arr = {2,6,12,18,21,26,33,42};
    int[] arr = {2,6,12,18,21,26,26,26,26,33,42};
    int target =  26;
        System.out.println(countElement2(arr, target));
    }

    // no duplicates
    static int countElement1(int[] arr, int target){
        int low = 0;
        int high = arr.length-1;
        int mid = 0;

        while (low <= high){
             mid = (low + high)/2;

            if (target == arr[mid])
                break;

            if (target < arr[mid])
                high =  mid -1;
            else
                low = mid + 1;
        }
        return  mid + 1;
    }

    // found duplicates
    static int countElement2(int[] arr, int target){
        int low = 0;
        int high = arr.length-1;
        int mid = 0;

        while (low <= high){
             mid = (low + high)/2;

            if (target == arr[mid]) {
                while (arr[mid + 1] == target && mid + 1 < arr.length) {
                    mid++;
                }
                break;
            }

            if (target < arr[mid])
                high =  mid -1;
            else
                low = mid + 1;
        }
        return  mid + 1;
    }

}
