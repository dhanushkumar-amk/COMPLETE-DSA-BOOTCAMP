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
            int breakpoint = (2*i+1)/2;
            for(int j=1;j<=2*i+1;j++){

                System.out.print(ch);
                if(j <= breakpoint) ch++;
                else ch--;
            }
            System.out.println();
        }
    }
}
