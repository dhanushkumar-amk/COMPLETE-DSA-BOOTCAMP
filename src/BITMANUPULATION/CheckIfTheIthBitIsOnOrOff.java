package BITMANUPULATION;

public class CheckIfTheIthBitIsOnOrOff {
    public static void main(String[] args) {
        int n = 36;
        int i= 5;
        int mask = 1 << i;
        int result = n & mask;

        if (result == 0)
            System.out.println("off");
        else
            System.out.println("on");
    }
}
