package OOPS.INTERFACES.EXTENDSDEMO1;

public interface A  {


    // static interface method should contain body
    static void greeting(){
        System.out.println("i am in static method");
    }


    // on till java 8
    default void fun(){
        System.out.println("i am in a");
    }
}
