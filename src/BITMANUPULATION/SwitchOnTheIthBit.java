package BITMANUPULATION;

public class SwitchOnTheIthBit {
    public static void main(String[] args) {
        int n =36;
        int i = 3;

        int onMask = 1 << i;
        int result = n | onMask;
        System.out.println(result);

    }
}
