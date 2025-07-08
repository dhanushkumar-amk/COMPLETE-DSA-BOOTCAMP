package STRIVER_SHEET.PATTERNS;

public class Pattern15 {
    public static void main(String[] args) {
        nLetterTriangle(5);
    }

    public static void nLetterTriangle(int n) {
        for (int i = 0; i < n; ++i) {
            for (char j = 0; j <= i; ++j) {
                System.out.print( + j);
            }
            System.out.println();
        }
    }
}
