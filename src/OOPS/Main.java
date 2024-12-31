package OOPS;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Students student = new Students();


    }
}

    // create a class

    // we can create own data type using class
    class Students{

        int rollNo;
        String name;
        float marks;

        public Students(int rollNo, String name, float marks) {
            this.rollNo = rollNo;
            this.name = name;
            this.marks = marks;
        }
    }



