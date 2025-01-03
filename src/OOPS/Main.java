package OOPS;



public class Main {
    public static void main(String[] args) {

        Students student = new Students(10, "dhanushkumar", 10.8f);
        Students students = new Students(20, "ram", 45.0f);



        System.out.println(student.marks);
        System.out.println(student.rollNo);
        System.out.println(student.name);

        student.changeName("something special");
        student.greeting();



        /*
        System.out.println(students.marks);
        System.out.println(students.rollNo);
        System.out.println(students.name);
        students.greeting();

         */


    }
}

    // create a class

    // we can create own data type using class
    class Students{

        int rollNo;
        String name;
        float marks;


        void changeName(String name){
            this.name = name;
        }

        void greeting(){
            System.out.println("Hello my name is " + this.name);
        }



        // constructor overloading
        public Students(int rollNo, String name, float mark) {
            this.rollNo = rollNo;
            this.name = name;
            this.marks = mark;

            // this.marks = marks == marks = marks
        }





        // constructor type
        /*

        1. default constructor
        2. parameterized constructor

         */

    }



