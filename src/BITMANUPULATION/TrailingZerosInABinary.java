package BITMANUPULATION;

public class TrailingZerosInABinary {
    public static void main(String[] args) {
        int n = 168;
        System.out.println(trailing(n));
    }
    static  int trailing(int n){
        return (int) (Math.log10((n & n - 1) ^ n) / Math.log10(2));
    }
}
