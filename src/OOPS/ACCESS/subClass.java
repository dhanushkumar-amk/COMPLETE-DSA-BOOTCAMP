package OOPS.ACCESS;

public class subClass extends  A{
    
    public subClass(String name, int num) {
        super(name, num);
    }

    public static void main(String[] args) {
        subClass obj = new subClass("dhanush", 10);


        System.out.println(obj instanceof  A);
    }



}
