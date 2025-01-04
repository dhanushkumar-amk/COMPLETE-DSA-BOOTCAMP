package OOPS.Static;



public class Human {
    int age;
    String name;
    int salary;
    boolean isMarried;
   static long population;


   static void message(){
       System.out.println("hello");
       // System.out.println(this.name);
       // we can't ue this keyword
   }

    public Human(int age, boolean isMarried, String name, int salary) {
        this.age = age;
        this.isMarried = isMarried;
        this.name = name;
        this.salary = salary;

        //this.population =+ 1;
        // both are correctly working but conversion we use class.variable
        Human.population += 1;

        Human.message();

    }


}
