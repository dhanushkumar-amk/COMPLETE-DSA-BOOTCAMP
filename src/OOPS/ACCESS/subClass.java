package OOPS.ACCESS;

public class subClass extends  A{
    
    public subClass(String name, int num) {
        super(name, num);
    }

    public static void main(String[] args) {
        subClass obj = new subClass("dhanush", 10);


        // check if it is instance of a parent class
        System.out.println(obj instanceof  A);

        // get the data about the class
        System.out.println(obj.getClass());
    }



}
