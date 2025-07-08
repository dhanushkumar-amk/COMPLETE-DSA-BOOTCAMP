package STRIVER_SHEET.PATTERNS;

public class Pattern6 {
    public static void main(String[] args) {
        nNumberTriangle(5);
    }
    public static void nNumberTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
