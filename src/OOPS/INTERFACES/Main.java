package OOPS.INTERFACES;

public class Main {
    public static void main(String[] args) {
        Engine car = new Car();


        car.acc();
        car.start();
        car.stop();
//        car.brake(); // we can't accesses car.break because it reference to the Engine class

        System.out.println("-------------------------");
        Media carMedia = new Car();
        carMedia.stop();

    }
}
