package OOPS;

public class WrapperClasses {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        // it will created as a object
        Integer num1= 20;
        Integer num2= 10;


        // ut can't be swap because java is a pass by value
        swap(a, b);
        System.out.println(a + " " +  b);


        swap1(num1, num2);
        System.out.println(num1 + " " + num2);
    }

    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }


    static void swap1(Integer num1, Integer num2){
        int temp = num1;
        num1 = num2;
        num2 = temp;
    }

}
