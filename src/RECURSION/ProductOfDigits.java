package RECURSION;

public class ProductOfDigits {
    public static void main(String[] args) {
        int n = 12345;
        System.out.println(product(n));
    }
    static int product(int n){
        if (n == 0)
            return 1;

        return product(n/ 10) * product(n % 10);
    }
}
