package BITMANUPULATION;

public class swap {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        swapp(a, b);
    }
    static void swapp(int a, int b){
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("After swapping: A = " + a + " ||  B = " + b);
    }
}
