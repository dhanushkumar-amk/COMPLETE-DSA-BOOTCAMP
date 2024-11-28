package MATHS;

public class PrintDivisorOfANumber {
    public static void main(String[] args) {
        int n = 20;
        divisor(n);
    }

    public static  void divisor(int n){
        for (int i = 1; i <=n ; i++) {
            if (n % i == 0){
                System.out.println(i);
            }
        }
    }
}
