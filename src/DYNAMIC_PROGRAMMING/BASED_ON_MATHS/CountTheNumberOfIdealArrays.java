package DYNAMIC_PROGRAMMING.BASED_ON_MATHS;

//
// leetcode : 2338


public class CountTheNumberOfIdealArrays {

    public static void main(String[] args) {
        CountTheNumberOfIdealArrays answer = new CountTheNumberOfIdealArrays();
        int n = 2;
        int maxValue = 5;
        System.out.println(answer.idealArrays(n, maxValue));
    }


    int n, maxValue;
    int MOD = 1_000_000_007;
    long[][] comb;
    Integer[][] memo;
    public int idealArrays(int n, int maxValue) {

        this.n  = n;
        this.maxValue = maxValue;

        comb = new long[n + 1][15];
        for (int i = 0; i <= n; i++) {
            comb[i][0] = 1;
            for (int j = 1; j <= Math.min(i, 14); j++) {
                comb[i][j] = (comb[i - 1][j - 1] + comb[i-1][j])% MOD;
            }
        }


        memo = new Integer[maxValue + 1][15];

        long total = 0;
        for (int start = 1; start <= maxValue; start++) {
            for (int len = 1; len <= 14 && len <= n; len++) {
                int ways = dfsHelper(start, len);
                total = (total + ways * comb[n - 1][len - 1]) % MOD;
            }
        }

        return  (int) total;
    }

    private int dfsHelper(int value, int len) {
        if (len == 1)
            return 1;

        if (memo[value][len] != null)
            return memo[value][len];

        long count = 0;
        for (int next = value * 2; next <= maxValue ; next += value) {
            count = (count + dfsHelper(next, len - 1))  % MOD;
        }

        return memo[value][len] = (int) count;
    }

}
