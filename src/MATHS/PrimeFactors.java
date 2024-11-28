package MATHS;

public class PrimeFactors {
    public static void main(String[] args) {
int n = 900;
factorsPrime(n);
    }


    // method 1
    public  static  void factorsPrime(int n){
        int i = 2;
        while (n > 1){
            while(n % i == 0){
                System.out.print(i + " ");
                n = n / i;
            }
            i++;
        }
      }
}
