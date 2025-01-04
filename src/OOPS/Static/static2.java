package OOPS.Static;



public class static2 {
    static int a = 4;
    static int b;

    static {
        System.out.println("i am from the static block");
        b = a * 5;
    }

    public static void main(String[] args) {
        static2 obj = new static2();
        System.out.println(static2.a + " ");
    }

}
