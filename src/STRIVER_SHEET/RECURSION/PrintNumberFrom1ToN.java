package STRIVER_SHEET.RECURSION;

public class PrintNumberFrom1ToN {
    public static void main(String[] args) {
        func(1, 5);
    }

    static void func(int i, int n){
        if(i > n)
            return;

        System.out.println("i : " +  i);
        func(i + 1, n);
    }
}
