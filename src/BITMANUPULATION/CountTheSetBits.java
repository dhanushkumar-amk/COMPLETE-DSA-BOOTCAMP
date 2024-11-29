package BITMANUPULATION;

public class CountTheSetBits {
    public static void main(String[] args) {
        int n = 42;
        System.out.println(countSetBits(n));
    }

    static  int countSetBits(int n){
        int count = 0;
        while (n != 0) {
            n = n & (n - 1);
            count++;
        }
        return count;
    }
}
