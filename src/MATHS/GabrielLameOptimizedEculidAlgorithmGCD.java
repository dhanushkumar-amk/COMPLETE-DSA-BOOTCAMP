package MATHS;

public class GabrielLameOptimizedEculidAlgorithmGCD {
    public static void main(String[] args) {
        int a = 20;
        int b = 15;
        System.out.println(gcd(a,b));
    }
    public  static  int gcd(int a , int b) {
        while (a != 0 && b != 0) {
            if (a < b)
                a = a % b;
            else
                b = b % a;
        }
        if (a != 0)
            return a;
        else
            return b;
    }
}
