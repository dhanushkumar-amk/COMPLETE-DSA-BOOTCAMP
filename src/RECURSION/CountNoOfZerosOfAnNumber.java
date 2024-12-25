package RECURSION;

public class CountNoOfZerosOfAnNumber {
    public static void main(String[] args) {
    int n  = 20202020;
        System.out.println(countZero(n));


    }
    static int countZero(int n){
        return helper( n, 0);
    }

    private static int helper(int n, int counter){
        if (n == 0)
            return counter;

        int rem = n % 10;

        if (rem == 0)
            return helper(n/10, counter + 1);
        else
            return helper(n/10, counter);
    }
}
