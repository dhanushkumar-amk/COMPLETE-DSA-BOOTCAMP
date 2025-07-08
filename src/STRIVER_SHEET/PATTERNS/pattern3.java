package STRIVER_SHEET.PATTERNS;

public class pattern3 {
    public static void main(String[] args) {
        nTriangle(5);
    }
    public static void nTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
