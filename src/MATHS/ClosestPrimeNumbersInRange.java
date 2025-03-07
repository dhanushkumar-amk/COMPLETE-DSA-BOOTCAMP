package MATHS;

// leetcode 2523
// https://leetcode.com/problems/closest-prime-numbers-in-range/description/?envType=daily-question&envId=2025-03-07

import java.util.*;

public class ClosestPrimeNumbersInRange {

    public static void main(String[] args) {
        int left = 11;
        int right = 20;

        int[] answer = closestPrimes(left, right);
        System.out.println(Arrays.toString(answer));
    }

    public static int[] closestPrimes(int left, int right) {
        boolean[] sieve = new boolean[right + 1];
        Arrays.fill(sieve, true);
        sieve[0] = false;
        sieve[1] = false;

        for (int i = 2; i * i <= right; i++) {
            if (sieve[i] == true) {
                for (int j = i * i; j <= right; j += i) {
                    sieve[j] = false;
                }
            }
        }

        List<Integer> primes = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (sieve[i]) {
                primes.add(i);
            }
        }

        if (primes.size() < 2) {
            return new int[]{-1, -1};
        }

        int minGap = Integer.MAX_VALUE;
        int[] result = {-1, -1};

        for (int i = 1; i < primes.size(); i++) {
            int gap = primes.get(i) - primes.get(i - 1);
            if (gap < minGap) {
                minGap = gap;
                result[0] = primes.get(i - 1);
                result[1] = primes.get(i);
            }
        }
        return result;
    }
}
