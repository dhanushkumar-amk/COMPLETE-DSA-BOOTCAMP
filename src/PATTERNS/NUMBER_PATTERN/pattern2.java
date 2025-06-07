package PATTERNS.NUMBER_PATTERN;

public class pattern2 {
    public static void main(String[] args) {
        int n = 7;

        for (int i = 1; i < n; i++) {
            for (int j = n; j >= i; j--) {
                int temp = 0;
                j = temp;
                System.out.print(j + " ");
            }
            System.out.println();
        }
        
    }
}
