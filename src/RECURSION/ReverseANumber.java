package RECURSION;

public class ReverseANumber {
    public static void main(String[] args) {

        int n = 522;
        System.out.println(reverse(n));
    }

    static int  sum  = 0;
    static void reverse1(int n){

        if (n == 0)
            return;


        int remainder = n % 10;
        sum = sum * 10 + remainder;

        reverse1(n / 10);
    }

    static int reverse(int n){
        int digit = (int) (Math.log10(n)) + 1;
        return helper(n, digit);
    }

    private static int helper(int n, int digit){
        if (n % 10 == n)
            return n;
        int rem = n % 10;
        return rem * (int) Math.pow(n, digit - 1) + helper(n/10, digit - 1);
    }
}
