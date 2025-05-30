package OOPS.INTERFACES.NESTEDINTERFACE;

public class A {

    // nested interface


    public interface NestedInterface{
        boolean isOddOREven(int n);
    }
}

class B implements A.NestedInterface {

    //  A.NestedInterface because class A inside  NestedInterface interface

    @Override
    public boolean isOddOREven(int n) {
        return (n & 1) == 1;
    }
}