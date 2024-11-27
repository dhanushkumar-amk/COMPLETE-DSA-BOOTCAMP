package MATHS;

public class GCD_and_HCF_of_tow_numbers {
    public static void main(String[] args) {
        int a = 20;
        int b = 15;
        gcd(a, b);
    }

    public static  void gcd(int a, int b){
        int min = 0;
        if ( a < b)
            min = a;
        else
            min = b;

            for (int i = min; i >= 1;  i--) {
            if (a / i == 1 && b / i == 1) {
                System.out.println(i);
                break;
            }
        }
    }
}
