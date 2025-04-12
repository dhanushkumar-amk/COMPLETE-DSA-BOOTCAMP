package MATHS;


// leetcode 2999
// https://leetcode.com/problems/count-the-number-of-powerful-integers/description/?envType=daily-question&envId=2025-04-10

public class CountTheNumberOfPowerfulIntegers {

    public static void main(String[] args) {
        long start = 1;
        long finish = 6000;
        int limit = 4;
        String s = "124";

        CountTheNumberOfPowerfulIntegers answer = new CountTheNumberOfPowerfulIntegers();

        System.out.println(answer.numberOfPowerfulInt(start, finish, limit, s));

    }

    public long numberOfPowerfulInt(long start, long finish, int limit, String s) {

        long suffix = Integer.parseInt(s);
        long base = (long) Math.pow(10, s.length());

        int count = 0;

        for (long num = suffix; num <= finish; num += base) {
            if (num >= start && isLimitedDigit(num, limit))
                count++;
        }
        return count;
    }

    // if the digit is greater than limit return false
    private boolean isLimitedDigit(long num, int limit) {
        while (num > 0){
            if (num % 10 > limit)
                return false;
            num /= 10;
        }
        return true;
    }

}
