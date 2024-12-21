package RECURSION;

public class SumOfAllDigits {
    public static void main(String[] args) {
        int n = 1234;
        System.out.println(sum(n));
    }
    static int sum(int n){
        if (n == 0)
            return 0;

        return sum(n/10) + n%10;
    }
}
