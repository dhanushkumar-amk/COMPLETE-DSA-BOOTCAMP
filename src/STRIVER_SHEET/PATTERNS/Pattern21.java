package STRIVER_SHEET.PATTERNS;

public class Pattern21 {
    public static void main(String[] args) {
        upperPart(5);
        lowerPart(5);
    }

    public static void upperPart(int n) {
        for (int i = 0; i < n; ++i) {

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

    public static void lowerPart(int n){
        for (int i = 0; i < n; ++i) {

            for (int prefixStar = 0; prefixStar < i + 1; ++prefixStar) {
                System.out.print("*");
            }


            for (int suffixStar = 0; suffixStar < i + 1; suffixStar++) {
                System.out.print("*");
            }

        }
    }
}
