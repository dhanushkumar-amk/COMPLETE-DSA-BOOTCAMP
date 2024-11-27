package MATHS;

public class EuclidLCM {
    public static void main(String[] args) {
        int a = 2;
        int b = 5;
        System.out.println(LCM(a, b));
    }
    // lcm function
    public static int LCM(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    // gcd function
    public  static  int gcd(int a, int b){
        while (a!= 0 && b != 0){
            if( a > b)
                a = a % b;
            else
                b = b % a;
        }
        if ( a != 0)
            return a;
        else
            return  b;
    }
}
