package RECURSION;

public class PrintTheNumbersNTo1 {
    public static void main(String[] args) {
        numbers(5);
    }

    static void numbers(int n){

        if (n < 1)
            return;

        System.out.println(n);
            numbers(n - 1);
    }
}
