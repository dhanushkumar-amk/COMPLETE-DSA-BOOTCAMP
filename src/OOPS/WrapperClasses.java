package OOPS;

public class WrapperClasses {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        // it will created as a object
        Integer num = 20;

        swap(a, b);
        System.out.println(a + " " +  b);
    }

    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }

}
