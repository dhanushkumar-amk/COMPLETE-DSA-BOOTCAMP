package SYSTEM_DESIGN.OOPS;

public class StaticBlock {
    static int a = 4;
    static  int b;

    // it will only runs when the object created first time on class loaded
    static {
        System.out.println("I am in static block");
        b = a * 5;
    }

    

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock.b += 3;

        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

    }
}
