package STRIVER_SHEET.BINARYSEARCH;

public class UpperBond {
    public static void main(String[] args) {
        int[] arr = {1,4,6,7,7,8,9};
        System.out.println(upperBoundIndex(arr, 3));
    }

    public static int upperBoundIndex(int[] arr, int target){
        int n = arr.length;
        int low = 0;
        int high = n - 1;
        int ans = 0;


        while(low <= high){
            int mid = (low + high) / 2;

            if(arr[mid] <= target){
                ans = mid;
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return ans;
    }
}
