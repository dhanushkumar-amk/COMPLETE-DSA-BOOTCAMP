package STRIVER_SHEET.PATTERNS;

public class Pattern20 {
    public static void main(String[] args) {
        alphaHill(5);
    }

    public static void alphaHill(int n) {
        for (int i = 0; i < n; i++) {
            // Print leading spaces
            for (int space = 0; space < n - i - 1; space++) {
                System.out.print(" ");
            }

            // Print ascending characters
            char ch = 'A';
            for (int j = 0; j <= i; j++) {
                System.out.print(ch++);
            }

            // Print descending characters
            ch -= 2; // Move one step back to avoid duplication
            for (int j = 0; j < i; j++) {
                System.out.print(ch--);
            }

            System.out.println();
        }
    }
}
