package STRIVER_SHEET.PATTERNS;

public class Pattern18 {
    public static void main(String[] args) {
        getStarPattern(5);
    }

        public static void getStarPattern(int n) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if(i == 0 || i == n - 1 || j == 0 || j == n - 1){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
}
