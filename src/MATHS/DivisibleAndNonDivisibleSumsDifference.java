package MATHS;

// leetcode : 2894
// https://leetcode.com/problems/divisible-and-non-divisible-sums-difference/description/?envType=daily-question&envId=2025-05-27

public class DivisibleAndNonDivisibleSumsDifference {

    public static void main(String[] args) {
        DivisibleAndNonDivisibleSumsDifference ans = new DivisibleAndNonDivisibleSumsDifference();
        System.out.println(ans.differenceOfSums(10, 3));
    }
    public int differenceOfSums(int n, int m) {
        int num1 = 0;
        int num2 = 0;

        int result = 0;
        for (int i = 1; i <= n; i++) {
            if(i % 3 == 0)
                num1 += i;
            else
                num2 += i;
        }
    return num2 - num1;
    }

}
