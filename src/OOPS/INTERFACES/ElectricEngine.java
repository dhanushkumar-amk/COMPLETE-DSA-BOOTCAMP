package OOPS.INTERFACES;

public class ElectricEngine implements Engine{

    @Override
    public void acc() {
        System.out.println("Electric engine acc ");
    }

    @Override
    public void start() {
        System.out.println("Electric engine start ");
    }

    @Override
    public void stop() {
        System.out.println("Electric engine stop ");
    }
}
