package STRIVER_SHEET.PATTERNS;

public class Pattern5 {
    public static void main(String[] args) {
        seeding(5);
    }
    public static void seeding(int n) {
        for (int i = n; i > 0; ++i) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
