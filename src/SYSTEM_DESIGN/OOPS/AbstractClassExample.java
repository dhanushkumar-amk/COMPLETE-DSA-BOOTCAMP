package SYSTEM_DESIGN.OOPS;

public class AbstractClassExample {
    public static void main(String[] args) {
        Hp hp = new Hp();
        hp.turnOn();
        hp.turnOff();
    }
}

abstract class computer{
    void turnOn(){
        System.out.println("Turning on");
    }
    abstract void turnOff();
}

class Hp extends computer {
    @Override
    void turnOn() {
        System.out.println("HP is turning on");
    }

    @Override
    void turnOff() {
        System.out.println("HP is turning off");
    }
}
