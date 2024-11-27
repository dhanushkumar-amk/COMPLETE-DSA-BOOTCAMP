package MATHS;

public class GCD_and_HCF_of_tow_numbers {
    public static void main(String[] args) {
        int n = 20;
        int m = 15;

    }

    public static  int gcd(int n, int m){
        int min = Math.min(n, m);
            int result ;
        for (int i = min; i <= 1; i--) {
            if (m % i == 1 && n % i == 1){
                result  =  i;
            }
            break;
        }
        return  result;
    }
}
