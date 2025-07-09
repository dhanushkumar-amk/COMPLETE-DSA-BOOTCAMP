package solveSTRIVER_SHEET.PATTERN;

public class Pattern21 {
    public static void main(String[] args) {
        symmetry(5);
    }

    public static void symmetry(int n) {
        // Upper half
        int spaces = 0;
        for (int i = n; i > 0; i--) {
            // Left stars
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            // Middle spaces
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            // Right stars
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            spaces += 2;
            System.out.println();
        }

        // Lower half
        spaces = 2 * (n - 1);
        for (int i = 1; i <= n; i++) {
            // Left stars
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            // Middle spaces
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            // Right stars
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            spaces -= 2;
            System.out.println();
        }
    }
}
