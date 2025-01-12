package OOPS.COMPARINGOBJECTS;

public class Main  {
    public static void main(String[] args) {

        Student dhanush = new Student(10, 20);
        Student kumar = new Student(102, 21);


       // we can't directly compare objects because it consists more than one variables
        if (dhanush.compareTo(kumar)< 0)
            System.out.println("dhanush has more marks");
        else
            System.out.println("kumar has more marks");



    }
}
