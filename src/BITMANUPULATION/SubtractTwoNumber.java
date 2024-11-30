package BITMANUPULATION;

public class SubtractTwoNumber {
    public static void main(String[] args) {
        int a = 20;
        int b = 10;
        System.out.println(sub(a, b));
    }

    static int sub(int a, int b){

        while (b != 0){
            int carry = ~(a) & b;

            a = a ^ b;

            b = carry << 1;
        }

        return a;
    }
}
