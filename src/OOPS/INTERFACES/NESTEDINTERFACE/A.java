package OOPS.INTERFACES.NESTEDINTERFACE;

public class A {

    // nested interface


    public interface NestedInterface{
        boolean isOddOREven(int n);
    }
}

class B implements A.NestedInterface{

    @Override
    public boolean isOddOREven(int n) {
        return (n & 1) == 0 ? true: false;
    }