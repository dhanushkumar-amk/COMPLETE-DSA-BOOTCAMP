package PATTERNS.NUMBER_PATTERN;

public class pattern5 {
    public static void main(String[] args) {
        int n = 7;

        for (int i = n; i >= 1; i--) {
            for (int j = n; j >= i; j--) {
                System.out.print( j+ " ");
            }
            System.out.println();
        }
    }
}