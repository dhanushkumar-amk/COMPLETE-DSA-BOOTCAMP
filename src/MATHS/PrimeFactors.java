package MATHS;

public class PrimeFactors {
    public static void main(String[] args) {

    }


    // method 1
    public  static  void factorsPrime(int n){
        int i = 2;
        while(n % i == 0){
            System.out.println(i);
            n = n / i;
        }
        i++;

    }
}
