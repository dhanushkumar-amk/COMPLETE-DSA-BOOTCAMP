package SYSTEM_DESIGN.OOPS;

public class InheritanceExample {

    String name;
    int age;
    int rollNo;

    public InheritanceExample(int age, String name, int rollNo) {
        this.age = age;
        this.name = name;
        this.rollNo = rollNo;
    }
}

class child extends InheritanceExample {
    int no;

    public child(int age, String name, int rollNo, int no) {
        super(age, name, rollNo);
        this.no = no;
    }

    @Override
    public String toString() {
        return "name : " + this.name + " \n"
                + "age : " + this.age + " \n"
                + "rollNo : " + this.rollNo;
    }

    public static void main(String[] args) {
        child obj = new child(10, "dhanush", 21, 10);
        System.out.println();
    }
}
