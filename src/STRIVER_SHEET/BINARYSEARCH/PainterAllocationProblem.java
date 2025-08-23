package STRIVER_SHEET.BINARYSEARCH;

public class PainterAllocationProblem {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 6, 2, 3};
        int k = 2;
        System.out.println(minTime(arr, k));
    }

    public static int minTime(int[] arr, int k) {
        int low = 0;
        int high = 0;

        for (int i = 0; i < arr.length; i++)
            high = high + arr[i];

        int result = -1;
        while(low <= high){
            int mid = (low + high)/2;

            if(isPossibleSolution(arr, k, mid)){
                result = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return result;
    }

    private static boolean isPossibleSolution(int[] arr, int k, int mid) {

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
