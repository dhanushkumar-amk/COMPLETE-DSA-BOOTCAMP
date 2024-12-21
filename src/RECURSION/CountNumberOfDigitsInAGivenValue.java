package RECURSION;

public class CountNumberOfDigitsInAGivenValue {
    public static void main(String[] args) {
        int n = 1232345445;
        System.out.println(count(n));
    }
    static int count(int n){

        if (n == 0)
            return 0;

        return count(n / 10) + 1;
    }
}
