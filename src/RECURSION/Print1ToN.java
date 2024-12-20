package RECURSION;

public class Print1ToN {
    public static void main(String[] args) {
        numbers(5);
    }

    static void numbers(int n){

        if (n < 1)
            return;

        numbers(n - 1);
        System.out.println(n);
    }
}
