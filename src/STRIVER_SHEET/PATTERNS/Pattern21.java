package STRIVER_SHEET.PATTERNS;

public class Pattern21 {
    public static void main(String[] args) {
       
    }

    public static void upperPart(int n) {
        for (int i = 0; i < n; ++i) {

            int initialSpace = 0;

            for (int prefixStars = 0; prefixStars < n - i; ++prefixStars) {
                System.out.print("*");
            }

            for (int space = 0; space < i * 2; ++space) {
                System.out.print(" ");
            }

            for (int suffixStar = 0; suffixStar < n - i; ++suffixStar) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
