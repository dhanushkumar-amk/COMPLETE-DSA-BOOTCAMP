package OOPS.INHERITANCE;

public class main {
    public static void main(String[] args) {

        Box box = new Box(4);

        /*
        Box box2 = new Box(box);
        // it consist all the property of the old constructor
        System.out.println(box2.l);
        System.out.println(box2.h);
        System.out.println(box2.w);


         */
        System.out.println(box.l);
        System.out.println(box.h);
        System.out.println(box.w);


        BoxWeight box3 = new BoxWeight(10,10,10,10);
        System.out.println(box3.h);
        System.out.println(box3.w);
        System.out.println(box3.l);
        System.out.println(box3.weight);
    }
}
