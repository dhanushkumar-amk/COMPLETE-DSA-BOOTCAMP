package STRIVER_SHEET.PATTERNS;

public class Pattern7 {
    public static void main(String[] args) {
        nStarTriangle(3);
    }
    public static void nStarTriangle(int n) {
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < i * 2; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < i * 2 + 1; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
