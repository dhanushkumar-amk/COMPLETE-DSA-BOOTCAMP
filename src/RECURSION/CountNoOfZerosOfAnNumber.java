package RECURSION;

public class CountNoOfZerosOfAnNumber {
    public static void main(String[] args) {
    int n  = 2020202000;
        System.out.println(countZero(n, 0));
    }
    static int countZero(int n, int count ){

        if (n == 0)
            return count;

        int remainder = n % 10;

        if (remainder == 0)
            return countZero(n / 10, count + 1);
        else
            return countZero(n/10, count);
    }


    /*
    private static int helper(int n, int counter){
        if (n == 0)
            return counter;

        int rem = n % 10;

        if (rem == 0)
            return helper(n/10, counter + 1);
        else
            return helper(n/10, counter);
    }
    */

}
