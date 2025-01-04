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
        System.out.println(static2.a + " " + static2.b);

    static2.b += 3;

    static2 obj2 = new static2();
        System.out.println(static2.b);

    }

}
