package DYNAMIC_PROGRAMMING.BASED_ON_MATHS;


// leetcode 2999
// https://leetcode.com/problems/count-the-number-of-powerful-integers/description/?envType=daily-question&envId=2025-04-10


import java.util.Arrays;

public class CountTheNumberOfPowerfulIntegers {


    public long numberOfPowerfulInt(long start, long finish, int limit, String s) {
        return helper(finish, limit, s) - helper(start - 1, limit, s);
    }

    private long helper(long num, int limit, String s) {

        String high = Integer.toString((int) num);
        int n  = high.length();

        if (s.length() > n)
            return 0;

        String low = "0".repeat(n - s.length()) + s;

        long[] memo = new long[n];
        Arrays.fill(memo, -1);

        return dfsHelper(0, true, high, low, limit, s.length(), memo);
    }

    private long dfsHelper(int i, boolean tight, String high, String full, int limit, int length, long[] memo) {

        if ( i == high.length())
            return 1;

        if (!tight && memo[i] != -1)
            return memo[i];


        int lo = 0;
        int hi = tight ? high.charAt(i) - '0' : 9;
        long result = 0;

        if (i < high.length() - length){
            for (int digit  = lo; digit  <= Math.min(hi, limit); digit ++) {
                result += dfsHelper(i + 1, tight && (digit == hi), high, full, limit, length, memo);
            }
        }else{
            int position = 1 - (high.length() - length);
            int digit = full.charAt(i) - '0';

            if (digit <= limit && digit >= lo && digit <= hi){
                result += dfsHelper(i + 1, tight && (digit == hi), high, full, limit, length, memo);
            }
        }

        if (!tight)
            memo[i] = result;

        return result;

    }

}
