package MATHS;

//import static MATHS.PrimeNumber.isPrime2;

public class PrimeNumberInGivenRange {
    public static void main(String[] args) {
        int n =14;
        printPrime(n);
    }
    //    isPrime function
    public static  boolean isPrime(int n){
        for (int i = 2; i * i <= n ; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

   public static void printPrime(int n){
        for (int i =2; i <= n ; i++) {
            if (isPrime(n))
                System.out.println(i);
        }
    }
}
