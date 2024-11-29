package BITMANUPULATION;

public class SwapAllOddAndEvenBits {
    public static void main(String[] args) {
        int n = 181;
        System.out.println(swapOddEven(n));
    }

    static  int swapOddEven(int n){
        return (( n & 0xaaaaaaaa) >>> 1) | ((n & 0x55555555) << 1);
    }
}
