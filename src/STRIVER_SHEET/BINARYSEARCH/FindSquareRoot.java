package STRIVER_SHEET.BINARYSEARCH;


public class FindSquareRoot {
    public static void main(String[] args) {
        int n = 7;
        System.out.println(sqrt(n));
    }

    public static int sqrt(int n){
        int ans = 1;
        int low = 1;
        int high = n;

        while (low <= high){
            int mid = (low + high)/2;
            if((mid * mid) <= n){
                ans = mid;
                low = mid + 1;
            }else
                high = mid - 1;
        }
        return ans;
    }
}
