package SYSTEM_DESIGN.OOPS;

public class StaticExample {
    public static void main(String[] args) {
        Human dhanush = new Human(20, "dhanushkumar", 100000);
        System.out.println(dhanush.population);
    }
}

class Human {
    String name;
    int age;
    int salary;
    static long population;

    public Human(int age, String name, int salary) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        Human.population += 1;
    }
}
