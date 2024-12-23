package RECURSION;

public class LuckyNumber {
    public static void main(String[] args) {
    int n = 13;
    int counter = 2;

        System.out.println(isLuckyNumber(n, counter));
    }
    static boolean isLuckyNumber(int n, int counter){

        if (n < counter)
            return true;

        if (n % counter == 0)
            return false;

        return isLuckyNumber(n - (n/counter), counter + 1);
    }
}
