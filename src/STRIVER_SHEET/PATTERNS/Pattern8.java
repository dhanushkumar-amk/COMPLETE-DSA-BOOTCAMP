package STRIVER_SHEET.PATTERNS;

public class Pattern8 {
    public static void main(String[] args) {
        nStarTriangle(5);
    }

    public static void nStarTriangle(int n) {
        for (int i = 0; i < n; i++) {

            for (int prefixSpace = 0; prefixSpace <  i; prefixSpace++) {
                System.out.print(" ");
            }

            for (int star = 0; star < 2 * n -(2 * i + 1); star++) {
                System.out.print("*");
            }
            
            for (int suffixSpace = 0; suffixSpace < i; suffixSpace++) {
                System.out.print(" ");
            }
            
            
            
        }
    }
}
