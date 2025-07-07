package SYSTEM_DESIGN.OOPS;

// outside class can't be static
public class InnerClass {
     static class Inner{
        String name;

        public Inner(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Inner a = new Inner("Dhanushkumar");
        Inner b = new Inner("Arun kumar");
        System.out.println(a.name);

        System.out.println(a);

    }

}
