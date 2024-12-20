package RECURSION;

public class PrintTheNumbersNTo1 {
    public static void main(String[] args) {
        numbers(5);
    }

    static void numbers(int n){

        for (int i = 1; i <=n ; i++) {
            System.out.println(i);
        }
    }
}
