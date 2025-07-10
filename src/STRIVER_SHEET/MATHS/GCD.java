package STRIVER_SHEET.MATHS;

public class GCD {
    public static void main(String[] args) {
        System.out.println(gcd(20, 40));
    }
    public static  int gcd(int a, int b){
k
        while (a > 0 && b > 0){
            if(a > b)
                a = a % b;
            else
                b = b % a;
        }
        return a == 0 ? b : a;
    }
}
