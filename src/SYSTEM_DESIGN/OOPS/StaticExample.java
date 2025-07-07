package SYSTEM_DESIGN.OOPS;

public class StaticExample {
    public static void main(String[] args) {
        Human dhanush = new Human(20, "hanushkumar", 100000);
        System.out.println(dhanush.toString());
    }
}

class Human {
    String name;
    int age;
    int salary;

    public Human(int age, String name, int salary) {
        this.age = age;
        this.name = name;
        this.salary = salary;
    }
}
