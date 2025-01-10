package OOPS.ABSTRACTCLASS;

public class Son  extends Parent{

    public Son(int age) {
        super(age);
    }

    @Override
    void career() {
        System.out.println("I am going to be a  doctor" );
    }

    @Override
    void partner() {
        System.out.println("i love some and her age is 20");
    }

    @Override
    void normal() {
        super.normal();
    }
}
