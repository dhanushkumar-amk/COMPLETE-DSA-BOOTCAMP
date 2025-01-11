package OOPS.INTERFACES;

public class PowerEngine implements Engine {
    @Override
    public void acc() {
        System.out.println("power engine accelerate");
    }

    @Override
    public void start() {
        System.out.println("power engine start");
    }

    @Override
    public void stop() {
        System.out.println("power engine stop");
    }
}
