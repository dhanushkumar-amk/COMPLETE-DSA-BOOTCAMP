package OOPS;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Students student = new Students();
        System.out.println(Arrays.toString(student.roll));

    }
}

    // create a class

    // we can create own data type using class
    class Students{
        int[] roll = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];


        Students(){
            int[] roll = {1,2,3,4,4};
        }
     }



