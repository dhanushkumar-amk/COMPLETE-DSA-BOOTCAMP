package OOPS.Static;

public class Main {
    public static void main(String[] args) {
        Human dhanush  = new Human(10, false, "dhanushkumar", 100000);
        Human sanjay  = new Human(11, true, "sanjaykumar", 200000);
        Human ashwin  = new Human(13, true, "ashwin", 300000);


        // accessing the static variable using className not instance variable
        System.out.println(Human.population);
        System.out.println(Human.population);
        System.out.println(Human.population);


        System.out.println(dhanush.name);

    }
}
