package OOPS.Static;

public class InnerClasses {


    // only nested class will be static
    // if the classes o function is static then everything inside is static
    static class A{
        String name;

         public A(String name) {
             this.name = name;
         }

        @Override
        public String toString() {
            return name;
        }

     }

    static class B{

    }


    static class C{

    }



    public static void main(String[] args) {
        A a = new A("dhanush");
        A b = new A("sanjay");


        // it contain a.toString() by default; ig it has own the it will use that otherwise use default method
        System.out.println(a);
//        System.out.println(a.name);
//        System.out.println(b.name);
    }
}



