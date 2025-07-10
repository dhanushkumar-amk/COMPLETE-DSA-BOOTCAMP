package STRIVER_SHEET.MATHS;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(isPrime(7));
        System.out.println(isPrime(10));
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
