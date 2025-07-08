package STRIVER_SHEET.PATTERNS;

public class Pattern11 {
    public static void main(String[] args) {
        nBinaryTriangle(5);
    }

    public static void nBinaryTriangle(int n) {
        for (int i = 0; i < n; ++i) {
            int firstValue = i % 2 == 0 ? 1 : 0;
            for (int j = 0; j <= i ; ++j) {
                if(firstValue == 1){
                    System.out.print(1 + " ");
                    firstValue = 0;
                }else{
                    System.out.print(0 + " ");
                    firstValue = 1;
                }
            }
            System.out.println();
        }
    }
}
