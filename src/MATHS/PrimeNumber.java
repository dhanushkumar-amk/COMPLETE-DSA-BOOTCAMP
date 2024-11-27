package MATHS;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        System.out.println(isPrime1(n));
//        System.out.println(isPrime2(n));
        System.out.println(isPrime3(n));
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
        for (int i = 2; i <=Math.sqrt(n) ; i++) {
            if ( n % i == 0)
                return false;
        }
        return true;
    }


    // method 3
    static  boolean isPrime3(int n){
        if (n == 1)
            return false;

        if (n == 2 || n == 3)
            return  true;

        if (n % 2 == 0 || n % 3 == 0)
            return false;

        for(int i = 5; i <= Math.sqrt(n); i+=6) {
            if ( n % i == 0 || n % (i+2) == 0)
                return false;
        }
        return true;
    }
}
