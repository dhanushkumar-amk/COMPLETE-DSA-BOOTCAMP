package MATHS;

public class PrintDivisorOfANumber {
    public static void main(String[] args) {
        int n = 20;
        divisor1(n);
    }

    // brute force method1
    public static  void divisor1(int n){
        for (int i = 1; i <=n ; i++) {
            if (n % i == 0){
                System.out.println(i);
            }
        }
    }


    // method 2
    public static  void divisor2(int n){
        for (int i = 1; i* i <= n ; i++) {
            if (n %)
        }
    }



}
