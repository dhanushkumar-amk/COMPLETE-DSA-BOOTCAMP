package BITMANUPULATION;

public class OddOrEven {
    public static void main(String[] args) {
        int n = 575454547;

        if ((n & 1) == 0)
            System.out.println("even");
        else
            System.out.println("odd");
    }
}
