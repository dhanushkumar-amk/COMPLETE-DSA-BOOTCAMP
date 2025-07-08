package STRIVER_SHEET.PATTERNS;

public class Pattern10 {
    public static void main(String[] args) {
        upperPath(5);
        lowerPath(5);
    }

    public static void upperPath(int n) {
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < i; ++j) {
                System.out.print("*");
            }

            for (int j = 0; j < n; ++j) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }


    public static void lowerPath(int n){
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n - i; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


}
