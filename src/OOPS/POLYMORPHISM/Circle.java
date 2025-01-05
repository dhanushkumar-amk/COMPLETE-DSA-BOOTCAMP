package OOPS.POLYMORPHISM;

public class Circle extends Shapes {

    @Override
    void area(){
        System.out.println("I am in circle");
        System.out.println("It is override the paren class with child class");
    }

    /*
    void area1(){
        System.out.println("Not override");
    }
     */

}
