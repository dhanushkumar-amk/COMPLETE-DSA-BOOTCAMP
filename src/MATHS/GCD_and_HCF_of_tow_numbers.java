package MATHS;

public class GCD_and_HCF_of_tow_numbers {
    public static void main(String[] args) {
        int n = 20;
        int m = 15;
        gcd(n, m);
    }

    public static  void gcd(int n, int m){
        int min = Math.min(n, m);
            for (int i = min; i >= 1;  i--) {
            if (n % i == 1 && m % i == 1) {
                System.out.println(i);
                break;
            }
        }
    }
}
