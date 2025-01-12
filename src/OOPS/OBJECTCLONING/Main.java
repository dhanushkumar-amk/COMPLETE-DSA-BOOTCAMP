package OOPS.OBJECTCLONING;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {


        Human dhanush = new Human(20, "dhanushkumar");
//        Human kumar = new Human(dhanush);

        Human kumar = (Human) dhanush.clone();

        System.out.println(kumar.name);
        System.out.println(kumar.age);
    }

}
