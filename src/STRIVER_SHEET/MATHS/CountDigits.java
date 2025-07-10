package STRIVER_SHEET.MATHS;

public class CountDigits {
    public static void main(String[] args) {
        int n = 336;
        System.out.println(countDigit(n));
    }

    public static int countDigit(int n){
        int count = 0;
        while(n > 0){
            count++;
            n = n/10;
        }
        return count;
    }

}
