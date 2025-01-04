package OOPS.Static;

public class InnerClasses {

    static class A{
        String name;

         public A(String name) {
             this.name = name;
         }
     }

    static class B{

    }


    static class C{

    }

    public static void main(String[] args) {
        A a = new A("dhanush");
        A b = new A("sanjay");

        System.out.println(a.name);
    }
}



