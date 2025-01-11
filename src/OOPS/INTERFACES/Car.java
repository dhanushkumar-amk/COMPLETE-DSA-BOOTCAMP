package OOPS.INTERFACES;

public class Car implements Engine, Break {

    @Override
    public void brake() {
        System.out.println("break like a normal car");
    }

    @Override
    public void start() {
        System.out.println("start like a normal car");

    }

    @Override
    public void stop() {
        System.out.println("stop like a normal car");
    }

    @Override
    public void acc() {
        System.out.println("accelerate like a normal car");
    }
}
