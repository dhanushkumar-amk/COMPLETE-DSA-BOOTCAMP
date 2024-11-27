package MATHS;

// number of zeros in given factorial  number
public class TrailingZerosInAFactorial {
public static void main(String[] args) {
    int n = 5;
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
