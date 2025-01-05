package OOPS.INHERITANCE;

public class main {
    public static void main(String[] args) {

       // Box box = new Box(4);


//        Box box2 = new Box();
        // it consist all the property of the old constructor
//        System.out.println(box2.l);
//        System.out.println(box2.h);
//        System.out.println(box2.w);

        // static variable can access by the class name we don't need to create object
        Box.greeting();
        /*



        System.out.println(box.l);
        System.out.println(box.h);
        System.out.println(box.w);


         */

        /*
        BoxWeight box3 = new BoxWeight(10,10,10,10);
        System.out.println(box3.h);
        System.out.println(box3.w);
        System.out.println(box3.l);
        System.out.println(box3.weight);


         */

        // we can't access the parent class that refers the child class then we can't get the child class elements
    /*    Box box4 = new BoxWeight(1,2,3,5);
        System.out.println(box4.h);

//        BoxWeight box5 = new Box();
//        System.out.println(box4.h);



     */


        // it compile time java determines which function is called
        BoxPrice box = new BoxPrice(5, 8,10);
        BoxColor color = new BoxColor(1,2,3,4,"red");




    }
}
