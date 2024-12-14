package SEARCHING;

public class FindSquareOrFloorRootOfAnNumber {
    public static void main(String[] args) {
        int n =  37;
        System.out.println(sqrt(n));
    }
    static int sqrt(int n){

        // base case
        if (n == 1 || n == 0)
            return n;

        int low = 2;
        int high = n/2;

        int result = 0;
        while (low <= high){
            int mid = (low + high)/2;

            if (mid * mid == n)
                return mid;
            else if (mid * mid < n) {
                low = mid + 1;
               // result = mid;  // for floor
            }else {
                high = mid - 1;
                //result = mid // for ceil;
            }
        }
        return high;
    }
}
