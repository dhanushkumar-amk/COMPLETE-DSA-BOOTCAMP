package STRIVER_SHEET.RECURSION;

public class PrintNumberFromNTo1 {
    public static void main(String[] args) {
        func(1, 5);
    }

    static void func(int i, int n){
        if(i > n)
            return;

        func(i + 1, n);
        System.out.println(i);

    }
}
