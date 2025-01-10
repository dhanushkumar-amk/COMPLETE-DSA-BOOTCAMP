package OOPS.ABSTRACTCLASS;

abstract class Parent{

    int age;

    public Parent(int age) {
        this.age = age;
    }

     static void hello(){
         System.out.println("hello world");
     }

     void normal(){
         System.out.println("it is a normal class ");
     }

    abstract void career();
    abstract void partner();


}
