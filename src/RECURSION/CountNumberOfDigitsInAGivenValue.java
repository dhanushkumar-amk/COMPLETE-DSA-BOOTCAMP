package RECURSION;

public class CountNumberOfDigitsInAGivenValue {
    public static void main(String[] args) {
        int n = 1111;
        System.out.println(count(n));
    }
    static int count(int n){

        if (n == 0)
            return 0;

        return count(n / 10) + 1;
    }
}
