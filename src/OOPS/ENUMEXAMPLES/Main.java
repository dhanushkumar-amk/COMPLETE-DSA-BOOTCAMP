package OOPS.ENUMEXAMPLES;

public class Main {

    enum week{
        monday,
        tuesday,
        wednesday,
        thursday,
        friday,
        saturday,
        sunday;


        week() {
            System.out.println("Constructor called for " + this.);
        }
    }
    // these are called enum constants
    // every one in enum is public static and final one
    // since it is final so we can't inheritance
    // type is week

    public static void main(String[] args) {
        week weeks;
        weeks = week.friday;

        for (week day : week.values())
            System.out.println(day);


    }

}
