package STRIVER_SHEET.PATTERNS;

public class Pattern13 {
    public static void main(String[] args) {
        nNumberTriangle(5);
    }

    public static void nNumberTriangle(int n) {
        for (int i = 0; i < n; i++) {
            int startValue = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(startValue + " ");
                startValue++;
            }
            System.out.println();
        }
    }
}
