package STRIVER_SHEET.PATTERNS;


public class Pattern4 {
    public static void main(String[] args) {
        nTriangle(3);
    }
    public static void nTriangle(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
