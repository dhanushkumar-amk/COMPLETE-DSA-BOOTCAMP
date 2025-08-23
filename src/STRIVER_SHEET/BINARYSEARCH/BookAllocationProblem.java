package STRIVER_SHEET.BINARYSEARCH;

public class BookAllocationProblem {
    public static void main(String[] args) {
        int[] arr = {12, 34, 67, 90};
        int k  = 2;

        System.out.println(findPages(arr, k));
    }

    public static int findPages(int[] arr, int k) {

        int n = arr.length;

        if(k > n)
            return -1;

        int smallestElement = arr[0];
        int totalSum = 0;

        for (int i = 0; i < n; i++) {
            smallestElement = Math.min(smallestElement, arr[i]);
            totalSum = totalSum + arr[i];
        }

        int low = smallestElement;
        int high = totalSum;
        int res = -1;
        while (low <= high){
            int mid = (low + high)/2;

            if(isPossibleSolution(arr, mid, k)){
                 res = mid;
                high = mid - 1;
            }
            else
                low = mid + 1;
        }
        return res;
    }

    private static boolean isPossibleSolution(int[] arr, int mid, int k) {
        int studentCount = 1;
        int studentPageCount = 0;

        for (int i = 0; i < arr.length; i++) {

            if(arr[i] > mid)
                return false;

            if(studentPageCount + arr[i] <= mid){
                studentPageCount += arr[i];
            }else {
                studentCount++;
                if(studentCount > k)
                    return false;
                studentPageCount = arr[i];
            }
        }
        return true;
    }
}
