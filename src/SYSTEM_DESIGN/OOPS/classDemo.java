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

    public static void main(String[] args) {
        classDemo obj = new classDemo(10, "dhanushkumar", 21);
        System.out.println(obj.name);
        System.out.println(obj.age);
        System.out.println(obj.rollNo);
    }
}


// state, identity, behaviour