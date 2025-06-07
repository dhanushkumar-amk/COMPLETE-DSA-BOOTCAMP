package PATTERNS.NUMBER_PATTERN;

public class pattern4 {
    public static void main(String[] args) {
        int n = 7;
        for (int i = n; i >= 0 ; i--) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
