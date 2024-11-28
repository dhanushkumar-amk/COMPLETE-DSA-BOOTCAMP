package MATHS;

public class PrimeFactors {
    public static void main(String[] args) {
int n = 900;
factorsPrime2(n);
    }


    // method 1
    public  static  void factorsPrime1(int n){
        int i = 2;
        while (n > 1){
            while(n % i == 0){
                System.out.print(i + " ");
                n = n / i;
            }
            i++;
        }
      }

      // method 2
      public  static  void factorsPrime2(int n){
          int i = 2;
          while ( i * i <= n){
              while(n % i == 0){
                  System.out.print(i + " ");
                  n = n / i;
              }
              i++;
          }
          if (n > 1)
            System.out.println(n);
      }
}
