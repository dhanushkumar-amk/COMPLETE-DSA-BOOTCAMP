package SYSTEM_DESIGN.OOPS;

public class Final {
    String name;

    public Final(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        final int ONE = 1;
        System.out.println(ONE);

        final Final one = new Final("Dhanushkumar");
        System.out.println(one.name);
        one.name = "arun";
        System.out.println(one.name);

        final int age = 10;


        // we can modify the non primitive but we can't modify

    }
}


