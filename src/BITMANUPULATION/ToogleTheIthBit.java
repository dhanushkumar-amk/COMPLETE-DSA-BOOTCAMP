package BITMANUPULATION;

public class ToogleTheIthBit {
    public static void main(String[] args) {
        int n = 36;
        int i = 5;

        int mask = n << i;

        System.out.println(n ^ mask);
    }
}
