package OOPS.POLYMORPHISM;

public class Numbers {


    // ex

    int sum(int a, int b){
        return  a + b;
    }

    int sum(int a, int b, int c){
        return a + b + c;
    }

    

    public static void main(String[] args) {

        Numbers obj = new Numbers();

        obj.sum(10,20,30);
        obj.sum(10,20);

    }

}
