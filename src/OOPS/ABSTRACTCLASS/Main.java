package OOPS.ABSTRACTCLASS;

public class Main {
    public static void main(String[] args) {

        Son son = new Son(10);
        son.career();

        Daughter daughter = new Daughter(20);
        daughter.career();


        // we can create the static method in abstract class we can't be override but we can directly use that staffs
        Parent.hello();

        

    }
}