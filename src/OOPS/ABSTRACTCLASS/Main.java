package OOPS.ABSTRACTCLASS;

public class Main {
    public static void main(String[] args) {

        Son son = new Son(10);
        son.career();

        Daughter daughter = new Daughter(20);
        daughter.career();

        Parent.hello();

    }
}