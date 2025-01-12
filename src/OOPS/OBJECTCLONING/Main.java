package OOPS.OBJECTCLONING;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {


        Human dhanush = new Human(20, "dhanushkumar");
//        Human kumar = new Human(dhanush);

        Human kumar = (Human) dhanush.clone();

        System.out.println(kumar.name);
        System.out.println(kumar.age);

        System.out.println(dhanush.name);
        System.out.println(dhanush.age);



        System.out.println(Arrays.toString(kumar.arr));

        kumar.arr[0] = 100;
        System.out.println(Arrays.toString(kumar.arr));
        System.out.println(Arrays.toString(dhanush.arr));

    }

}
