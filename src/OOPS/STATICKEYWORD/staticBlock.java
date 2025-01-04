package OOPS.Static;



public class staticBlock {
    static int a = 4;
    static int b;


    // will only runs only once, when the object is created
    static {
        System.out.println("i am from the static block");
        b = a * 5;
    }

    public static void main(String[] args) {
        staticBlock obj = new staticBlock();
        System.out.println(staticBlock.a + " " + staticBlock.b);

        staticBlock.b += 3;

        staticBlock obj2 = new staticBlock();
        System.out.println(staticBlock.b);

    }

}
