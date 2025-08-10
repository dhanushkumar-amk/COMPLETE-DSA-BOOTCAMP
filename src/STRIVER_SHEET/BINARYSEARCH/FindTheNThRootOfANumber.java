package STRIVER_SHEET.BINARYSEARCH;

public class FindTheNThRootOfANumber {
    public static void main(String[] args) {
        System.out.println(nthRoot(3, 27));
    }

    public static int nthRoot(int n, int m){

        int low = 1;
        int high = m;

        while (low <= high)
        {
            int mid = (low + high)/2;

            int midN = helperFunc(mid, n, m);
            if(midN == 1)
                return mid;
            else if (midN == 0)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }

    private static int helperFunc(int mid, int n, int m) {
        int ans = 1;
        for (int i = 1; i <= n; i++) {
            ans = ans * mid;
            if(ans > m)
                return 2;
        }

        if(ans == m)
            return 1;
        return 0;
    }
}
