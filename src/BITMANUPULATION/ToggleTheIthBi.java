package BITMANUPULATION;

public class ToggleTheIthBi {
    public static void main(String[] args) {
        int n = 36;
        int i = 5;

        int mask = 1 << i;

        System.out.println(n ^ mask);
    }
}
