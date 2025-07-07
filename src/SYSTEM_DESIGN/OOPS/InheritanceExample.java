package SYSTEM_DESIGN.OOPS;

public class InheritanceExample {

    String name;
    int age;
    int rollNo;
    private boolean isMarried;

    public InheritanceExample(int age, String name, int rollNo, boolean isMarried) {
        this.age = age;
        this.name = name;
        this.rollNo = rollNo;
        this.isMarried = isMarried;
    }
}

class child extends InheritanceExample {
    int no;

    public child(int age, String name, int rollNo, int no, boolean isMarried) {
        super(age, name, rollNo, isMarried);
        this.no = no;
    }
    @Override
    public String toString() {
        return "name : " + this.name + " \n"
                + "age : " + this.age + " \n"
                + "rollNo : " + this.rollNo;
    }

    public static void main(String[] args) {
        child obj = new child(10, "dhanush", 21, 10, false);
        System.out.println(obj);
        // System.out.println(obj.isMarried); // can't be accces tge private variables
    }
}
