package OOPS.INHERITANCE;

public class Box {

     private double l;
    double h;
    double w;


    public double getL() {
        return l;
    }

    static void greeting(){
        System.out.println("i am in box class. greetings");
    }

    Box(){
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }

     Box(double h, double l, double w) {
        this.h = h;
        this.l = l;
        this.w = w;
    }


    // cube
    Box(double side){

        this.l = side;
        this.w = side;
        this.h = side;
    }



    // copy Constructor
    Box(Box old){
        this.h = old.h;
        this.w = old.w;
        this.l = old.l;
    }


    public  void information(){
        System.out.println("Running the box");
    }

}


