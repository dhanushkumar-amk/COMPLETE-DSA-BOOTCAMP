package STRIVER_SHEET.MATHS;

public class PrintAllDivisors {
    public static void main(String[] args) {
        printDivisors(36);
    }

    public static void printDivisors(int n){

        for (int i = 1; i <= Math.sqrt(36); i++) {
            if(n % i == 0){
                if(i == Math.sqrt(n)){
                    System.out.println(i);
                }
                else {
                    System.out.print(i + " " + n / i + " ");
                }
            }

        }
    }
}
