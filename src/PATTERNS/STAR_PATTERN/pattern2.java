package PATTERNS.STAR_PATTERN;

public class pattern2 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 5; j >= i ; j--) {
                System.out.println("* ");
            }
            System.out.println();
        }
    }
}
