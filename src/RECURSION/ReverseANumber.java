package RECURSION;

public class ReverseANumber {
    public static void main(String[] args) {

        int n = 522;
        reverse1(n);
        System.out.println(sum);
    }

    static int  sum  = 0;
    static void reverse1(int n){

        if (n == 0)
            return;


        int remainder = n % 10;
        sum = sum * 10 + remainder;

        reverse1(n / 10);


    }
}
