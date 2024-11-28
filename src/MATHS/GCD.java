package MATHS;

public class GCD {
    public static void main(String[] args) {
        int a = 15;
        int b = 20;
        System.out.println(gcd2(a, b));

    }
// method 1
    public static  void gcd1(int a, int b){
        int min = 0;
        if ( a < b)
            min = a;
        else
            min = b;

        for (int i = min; i >= 1;  i--) {
            if (a % i == 1 && b % i == 1) {
                System.out.println(i);
                break;
            }
        }
    }

// method 2
    public  static  int gcd2(int  a, int b){
        // find the largest number and take difference of largest number and smallest number and assume the difference value to largest value
        while (a  != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return  a;
    }

    // method 3
    public  static  int gcd3(int a , int b) {
        while (a != 0 && b != 0) {
            if (a > b)
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
