package OOPS.Static;



public class Human {
    int age;
    String name;
    int salary;
    boolean isMarried;
   static long population;

    public Human(int age, boolean isMarried, String name, int salary) {
        this.age = age;
        this.isMarried = isMarried;
        this.name = name;
        this.salary = salary;
        Human.population += 1;
    }


}
