package BITMANUPULATION;

public class CheckIfTheValueIsConsecutiveOnesOrNot {
    public static void main(String[] args) {
        int n = 101;
        System.out.println(consecutive(n));
    }

    static  boolean consecutive(int n){
        int mask = n & (n << 1);

        if (mask != 0)
            return true;
        else
            return false;
    }
}
