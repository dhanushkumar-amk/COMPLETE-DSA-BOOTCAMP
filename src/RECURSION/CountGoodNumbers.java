package RECURSION;


// leetcode 1922
// https://leetcode.com/problems/count-good-numbers/?envType=daily-question&envId=2025-04-13

public class CountGoodNumbers {

    public static void main(String[] args) {
        CountGoodNumbers answer = new CountGoodNumbers();
        System.out.println(answer.countGoodNumbers(4));
    }

    final int MOD = 1000000007;
    public int countGoodNumbers(long n) {
        return (int)((binaryExponentiation(4, n / 2) * binaryExponentiation(5, n - n / 2)) % MOD);
    }

    private long binaryExponentiation(int base, long exp) {

        

    }

}
