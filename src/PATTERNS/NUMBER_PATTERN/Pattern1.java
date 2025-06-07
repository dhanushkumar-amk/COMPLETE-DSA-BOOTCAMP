package PATTERNS.NUMBER_PATTERN;

public class Pattern1 {
    public static void main(String[] args) {
        int n = 7;
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <i + 1 ; j++) {
                System.out.print(j + 1 + " ");
            }
            System.out.println();
        }
    }
}

// 1
//1 2
//1 2 3
//1 2 3 4
//1 2 3 4 5
//1 2 3 4 5 6
//1 2 3 4 5 6 7