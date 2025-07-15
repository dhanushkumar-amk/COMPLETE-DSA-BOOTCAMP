package STRIVER_SHEET.RECURSION;

public class ParameterisedRecursion {
    public static void main(String[] args) {
        func(5, 0) ;
    }

    static void func(int i, int sum){
        if( i < 1){
            System.out.println("Sum : " + sum);
            return;
        }

        func(i - 1, sum + i);

    }

}
