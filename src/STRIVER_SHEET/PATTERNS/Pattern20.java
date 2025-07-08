package STRIVER_SHEET.PATTERNS;

public class Pattern20 {
    public static void main(String[] args) {
        alphaHill(5);
    }

    public static void alphaHill(int n) {
        for (int i = 0; i < n; i++) {

            for (int prefixSpace = 0; prefixSpace < n - i - 1; prefixSpace++) {
                System.out.print(" ");
            }

            

            for (int suffixSpace = 0; suffixSpace < n - i - 1; suffixSpace++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
