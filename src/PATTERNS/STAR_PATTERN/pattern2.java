package PATTERNS.STAR_PATTERN;

public class pattern2 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 5; j > n ; j--) {
                System.out.println("* ");
            }
            System.out.println();
        }
    }
}
