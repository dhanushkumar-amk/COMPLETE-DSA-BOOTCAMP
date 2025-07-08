package STRIVER_SHEET.PATTERNS;

public class Pattern20 {
    public static void main(String[] args) {
        alphaHill(5);
    }

    public static void alphaHill(int n) {
        for (int i = 0; i < n; i++) {

            for (int prefixSpace = 0; prefixSpace < n - i - 1; prefixSpace++) {
                System.out.print(" ");
            }

            char ch = 'A';
            int breakPoint = (n * i + 1)/2;
            for (int letter = 0; letter < 2 * i + 1; letter++) {
                System.out.print(ch);
                if(letter <= breakPoint) ch++;
                else ch--;
            }

            for (int suffixSpace = 0; suffixSpace < n - i - 1; suffixSpace++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
