package STRIVER_SHEET.PATTERNS;

public class Pattern21 {
    public static void main(String[] args) {
        symmetry(5);
    }

    public static void symmetry(int n) {
        for (int i = 0; i < n; ++i) {

            int initialSpace = 0;

            for (int prefixStars = 0; prefixStars < n - i; ++prefixStars) {
                System.out.print("*");
            }

            for (int space = 0; space <= initialSpace; ++space) {
                System.out.print(" ");
            }

            for (int suffixStar = 0; suffixStar < n - i; ++suffixStar) {
                System.out.print("*");
            }
            System.out.println();
            initialSpace *= 2;
        }
    }
}
