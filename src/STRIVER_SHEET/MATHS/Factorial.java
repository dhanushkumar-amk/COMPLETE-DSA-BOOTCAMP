package STRIVER_SHEET.MATHS;

import java.util.ArrayList;

public class Factorial {
    public static void main(String[] args) {
        ArrayList<Long> ans = factorialNumbers(5);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
    }

    public static ArrayList<Long> factorialNumbers(long n) {
        ArrayList<Long> ans = new ArrayList<>();
        long fact = 1;
        ans.add(fact);
        for (long i = 2; i <= n ; ++i) {
            fact = fact * i;
            ans.add(fact);
        }
    return ans;
    }
}
