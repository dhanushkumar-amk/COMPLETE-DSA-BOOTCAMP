package STRIVER_SHEET.PATTERNS;

public class Pattern9 {

    public static void main(String[] args) {
        upperPart(5);
        lowerPart(5);
    }


    public static void upperPart(int n){
        for (int i = 0; i < n; i++) {


            for (int prefixSpace = 0; prefixSpace < n - i - 1; prefixSpace++) {
                System.out.print(" ");
            }

            for (int star = 0; star < n * i + 1; star++) {
                System.out.print("*");
            }

            for (int suffixSpace = 0; suffixSpace < n - i - 1; suffixSpace++) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }

    public static void lowerPart(int n){
        for (int i = 0; i < n; i++) {

            for (int prefixStar = 0; prefixStar < i; prefixStar++) {
                System.out.print(" ");
            }

            for (int star = 0; star < 2 * n - (2 * i + 1); star++) {
                System.out.print("*");
            }

            for (int suffixStar = 0; suffixStar < i; suffixStar++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

}
