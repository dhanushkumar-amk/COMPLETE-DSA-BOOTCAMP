package MATHS;

public class PrimeNumberInGivenRange {
    public static void main(String[] args) {
        int n =14;
        printPrime(n);
    }


   public static void printPrime(int n){
        for (int i =2; i <= n ; i++) {
            if (isPrime(n))
                System.out.println(i);
        }
    }



//    isPrime function
    public static  boolean isPrime(int n){
        for (int i = 2; i * i <= n ; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
