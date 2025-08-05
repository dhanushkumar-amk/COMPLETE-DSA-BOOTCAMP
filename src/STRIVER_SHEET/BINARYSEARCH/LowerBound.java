package STRIVER_SHEET.BINARYSEARCH;

public class LowerBound {
    public static void main(String[] args) {
        int[] arr = {1,4,6,7,7,8,9};
        System.out.println(lowerBoundIndex(arr, 5));
    }

    public static int lowerBoundIndex(int[] arr, int target){
        int n = arr.length;
        int low = 0;
        int high = n - 1;
        int ans = n;


        while(low <= high){
            int mid = (low + high) / 2;

            if(arr[mid] >= target){
                ans = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }
}
