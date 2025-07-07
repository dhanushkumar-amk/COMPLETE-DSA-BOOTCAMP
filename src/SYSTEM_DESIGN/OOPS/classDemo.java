package SYSTEM_DESIGN.OOPS;

public class classDemo {

    int rollNo;
    String name;
    int age ;

    public classDemo(int age, String name, int rollNo) {
        this.age = age;
        this.name = name;
        this.rollNo = rollNo;
    }


    public classDemo(){
        this.age = 13;
        this.name = "dhanushkumar";
        this.rollNo = 10;
    }



    public static void main(String[] args) {
        classDemo obj = new classDemo(10, "dhanushkumar", 21);
        System.out.println(obj.name);
        System.out.println(obj.age);
        System.out.println(obj.rollNo);

        classDemo obj1 = new classDemo();
        System.out.println(obj1.name);
        System.out.println(obj1.age);
        System.out.println(obj1.rollNo);
    }
}


// object => state, identity, behaviour
// variable inside the objects is called instance variable

// object creation
//classDemo obj = new classDemo(10, "dhanushkumar", 21);
// compile time = run time



