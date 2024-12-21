package RECURSION;

public class FibonacciNumber {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(fibo(n));
    }
    static int fibo(int n){
        if (n == 1 || n == 2)
            return 1;

        return fibo(n - 1) + fibo(n - 2);
    }
}
