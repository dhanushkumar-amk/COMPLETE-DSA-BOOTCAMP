package BITMANUPULATION;

public class ConvertDecimalToBinary {
    public static void main(String[] args) {
        int n = 45;

        String b = " ";
        while (n >= 1){
            int x = n % 2;
            b = x + b;
            n = n / 2;
        }

        System.out.println(b);
    }
}
