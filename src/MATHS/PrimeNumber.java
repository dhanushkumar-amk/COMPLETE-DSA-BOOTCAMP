package MATHS;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPrime2(n));
    }

    // method 1
    static  boolean isPrime1(int n){
        for (int i = 2; i <n/2 ; i++) {
            if ( n % i == 0)
                return false;
        }
        return true;
    }

    // method 2

    static  boolean isPrime2(int n){
        for (int i = 2; i <Math.sqrt(n) ; i++) {
            if ( n % i == 0)
                return false;
        }
        return true;
    }

}
