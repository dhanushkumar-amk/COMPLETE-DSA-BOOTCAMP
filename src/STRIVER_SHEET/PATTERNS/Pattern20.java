package STRIVER_SHEET.PATTERNS;

public class Pattern20 {
    public static void main(String[] args) {
        alphaHill(5);
    }

    public static void alphaHill(int n) {
        for (int i = 0; i < n; i++) {
            for (char j = 'A'; j <= 'A' + (n - i - 1); j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
