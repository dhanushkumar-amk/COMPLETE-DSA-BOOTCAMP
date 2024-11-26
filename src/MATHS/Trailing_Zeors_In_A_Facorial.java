package MATHS;
public class Trailing_Zeors_In_A_Facorial {
public static void main(String[] args) {
    int n = 20;
    System.out.println(ZerosInFactorial(n));
}

public  static  int ZerosInFactorial(int n){
    int result = 0;
    int powerOf5 = 5;

    while( n >= powerOf5){
        result += n / powerOf5;
        powerOf5 = powerOf5 * 5;
    }

    return  result;
    }
}
