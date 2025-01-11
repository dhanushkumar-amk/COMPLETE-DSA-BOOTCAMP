package OOPS.INTERFACES.EXTENDEDDEMO;

public class Main implements A,B {


//    @Override
//    public void fun() {
//
//    }

    @Override
    public void greet() {
    }

    public static void main(String[] args) {
        Main main = new Main();


        // we can call it by interface name
        A.greeting();
    }
}
