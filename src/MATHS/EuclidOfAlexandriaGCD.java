package MATHS;

public class EuclidOfAlexandriaGCD {
    public static void main(String[] args) {
        int a = 20;
        int b = 15;
        System.out.println(gcd(a, b));
    }
    public  static  int gcd(int  a, int b){
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
}
