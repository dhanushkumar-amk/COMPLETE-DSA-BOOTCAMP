package SYSTEM_DESIGN.OOPS;

public class WrapperExample {

    public static void main(String[] args) {
//      a is assume as a object
        Integer a = 20;
        Integer b = 30;

        swap(a, b);

        System.out.println(a + " " + b);
    }

    static void swap(Integer a, Integer b){
        Integer temp = a;
        a = b;
        b = temp;
    }
}
