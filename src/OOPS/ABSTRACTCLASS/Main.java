package OOPS.ABSTRACTCLASS;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(10);
        System.out.println(son.age);
        son.career();

        Daughter daughter = new Daughter();
        daughter.career();
    }
}