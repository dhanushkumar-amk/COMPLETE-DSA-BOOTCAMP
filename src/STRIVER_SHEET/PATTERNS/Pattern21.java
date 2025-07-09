package STRIVER_SHEET.PATTERNS;

public class Pattern21 {
    public static void main(String[] args) {
        upperPart(5);
    }

    public static void upperPart(int n) {
        for (int i = 0; i < n; ++i) {

            int initialSpace = 0;

            for (int prefixStars = 0; prefixStars < n - i; ++prefixStars) {
                System.out.print("*");
            }

            for (int space = 0; space < initialSpace; ++space) {
                System.out.print(" ");
            }

            for (int suffixStar = 0; suffixStar < n - i; ++suffixStar) {
                System.out.print("*");
            }
            initialSpace += 2;
            System.out.println();
        }
        int initialSpace = 2 * n - 2;
        for (int i = 0; i < n; i++) {
            for (int prefixStars = 0; prefixStars < n - i; ++prefixStars) {
                System.out.print("*");
            }

            for (int space = 0; space < initialSpace; ++space) {
                System.out.print(" ");
            }

            for (int suffixStar = 0; suffixStar < n - i; ++suffixStar) {
                System.out.print("*");
            }
            initialSpace -= 2;
            System.out.println();
        }
    }

    public static void lowerPart(int n){
        for (int i = 0; i < n; ++i) {

            int initialSpace = 0;
            for (int prefixStar = 0; prefixStar < i + 1; ++prefixStar) {
                System.out.print("*");
            }

            for (int spaces = 0; spaces < ; spaces++) {

            }

            for (int suffixStar = 0; suffixStar < i + 1; suffixStar++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
