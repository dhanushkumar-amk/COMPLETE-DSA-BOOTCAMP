package RECURSION;

public class FactorialOfANumber {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
    static int factorial(int n){

        // base case
        if (n == 1)
            return 1;

        // recursive case
        return n * factorial(n - 1);


    }
}
