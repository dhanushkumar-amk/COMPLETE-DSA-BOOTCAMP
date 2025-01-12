package OOPS.COMPARINGOBJECTS;

import java.util.Arrays;

public class Main  {
    public static void main(String[] args) {

        Student dhanush = new Student(10, 20);
        Student kumar = new Student(102, 21);
        Student sanjay = new Student(106, 22);
        Student ashwin = new Student(104, 51);
        Student arun = new Student(103, 28);


        Student[] list = {dhanush, kumar, sanjay, ashwin, arun};

        System.out.println(Arrays.toString(list));
        


       // we can't directly compare objects because it consists more than one variables
        if (dhanush.compareTo(kumar)< 0)
            System.out.println("dhanush has more marks");
        else
            System.out.println("kumar has more marks");

    }
}
