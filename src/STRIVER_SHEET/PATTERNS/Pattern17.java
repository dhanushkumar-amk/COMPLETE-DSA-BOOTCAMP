package STRIVER_SHEET.PATTERNS;

public class Pattern17 {
    public static void main(String[] args) {

    }

    public static void alphaRamp(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print((char) (65 + i) + " ");
            }
            System.out.println();
        }
    }
}
