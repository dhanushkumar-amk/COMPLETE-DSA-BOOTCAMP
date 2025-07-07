package SYSTEM_DESIGN.OOPS;

public class AbstractClassExample {
    public static void main(String[] args) {
        son obj1 = new son();
        daughter obj2 = new daughter();

        obj1.career("Developer");
        obj1.partner("nothing");

        obj2.career("doctor");
        obj2.partner("john");
    }
}

abstract class parent{
    abstract void career(String career);
    abstract void partner(String partnerName);
}

class son extends parent{
    @Override
    void career(String career) {
        System.out.println("My career is become a " + career);
    }

    @Override
    void partner(String partnerName) {
        System.out.println("I don't have a partner yet" + partnerName);
    }
}
class daughter extends parent{
    @Override
    void career(String career) {
        System.out.println("I am become a" + career);
    }

    @Override
    void partner(String partnerName) {
        System.out.println("my name is " + partnerName);
    }
}
