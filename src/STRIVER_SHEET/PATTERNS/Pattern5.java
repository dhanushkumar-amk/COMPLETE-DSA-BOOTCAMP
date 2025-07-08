package STRIVER_SHEET.PATTERNS;

public class Pattern5 {
    public static void main(String[] args) {
        seeding(5);
    }
    public static void seeding(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; --j) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
