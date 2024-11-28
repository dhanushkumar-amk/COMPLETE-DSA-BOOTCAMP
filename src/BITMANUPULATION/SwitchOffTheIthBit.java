package BITMANUPULATION;

public class SwitchOffTheIthBit {
    public static void main(String[] args) {
        int n = 36;
        int i = 5;

        // mask operation example
        int offMask = ~(1 << i);

        int result = n & offMask;

        System.out.println(result);

        
    }
}
