package BITMANUPULATION;

public class AddTwoNumbers {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(add(a, b));
    }

    static int add(int a, int b){

        while (b != 0){
            int carry = a & b;

            a = a ^ b;

            b = carry << 1;
        }

        return a;
    }
}
