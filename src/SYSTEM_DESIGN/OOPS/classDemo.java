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

    public void greet(){
        System.out.println("hello, good " + this.name);
    }

    public classDemo(classDemo others){
        this.name = others.name;
        this.age = others.age;
        this.rollNo = others.rollNo;
    }

    public static void main(String[] args) {
        classDemo obj = new classDemo(10, "dhanushkumar", 21);
        System.out.println(obj.name);
        System.out.println(obj.age);
        System.out.println(obj.rollNo);
        obj.greet();



        classDemo obj1 = new classDemo();
        System.out.println(obj1.name);
        System.out.println(obj1.age);
        System.out.println(obj1.rollNo);

        classDemo copyConstructorExample = new classDemo(obj1);
        System.out.println(copyConstructorExample.name);
        System.out.println(copyConstructorExample.rollNo);
        System.out.println(copyConstructorExample.age);

    }
}


// object => state, identity, behaviour
// variable inside the objects is called instance variable

// object creation
//classDemo obj = new classDemo(10, "dhanushkumar", 21);
// compile time = run time



