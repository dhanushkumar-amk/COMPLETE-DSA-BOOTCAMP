package STRIVER_SHEET.PATTERNS;

public class Pattern2 {
    public static void main(String[] args) {
        nForest(3);

    }
    public static void nForest(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
