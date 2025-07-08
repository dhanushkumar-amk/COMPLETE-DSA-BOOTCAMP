package STRIVER_SHEET.PATTERNS;

public class Pattern19 {
    public static void main(String[] args) {
        getNumberPattern(4);
    }

    public static void getNumberPattern(int n) {
        for (int i = 0; i < 2 * n - 1; i++) {
            for (int j = 0; j < 2 * n - 1; j++) {
                int top = i;
                int left = j;
                int right = (2 * n - 1 - 1) - j;
                int bottom = (2 * n - 1 - 1) - i;
                int val = Math.min(Math.min(top, left), Math.min(right, bottom));
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
