package STRIVER_SHEET.PATTERNS;

public class Pattern7 {
    public static void main(String[] args) {
        nStarTriangle(3);
    }
    public static void nStarTriangle(int n) {
        for (int i = 0; i < n; i++) {

            for (int prefixSpace = 0; prefixSpace < n-i-1; prefixSpace++) {
                System.out.print(" ");
            }

            for (int star = 0; star < 2 * i + 1; star++) {
                System.out.print("*");
            }

            for (int suffixStar = 0; suffixStar < n-i-1; suffixStar++) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }
}
