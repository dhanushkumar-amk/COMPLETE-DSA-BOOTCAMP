package STRIVER_SHEET.MATHS;

public class PrintAllDivisors {
    public static void main(String[] args) {
        printDivisors(36);
    }

    public static void printDivisors(int n){

        for (int i = 1; i <= n; i++) {
            if(n % i == 0)
                System.out.print(i + " ");
        }
    }
}
