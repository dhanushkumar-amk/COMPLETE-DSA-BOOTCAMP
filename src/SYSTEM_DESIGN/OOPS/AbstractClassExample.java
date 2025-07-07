package SYSTEM_DESIGN.OOPS;

public class AbstractClassExample {
    public static void main(String[] args) {
        Hp hp = new Hp();
        hp.turnOn();
    }
}

abstract class computer{
    void turnOn(){
        System.out.println("Turning on");
    }
}

class Hp extends computer {
    @Override
    void turnOn() {
        System.out.println("HP is turning on");
    }
}
