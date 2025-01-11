package OOPS.INTERFACES;

public class CdPlayer implements  Media{
    @Override
    public void start() {
        System.out.println("media player start");
    }

    @Override
    public void stop() {
        System.out.println("media player stop");
    }
}
