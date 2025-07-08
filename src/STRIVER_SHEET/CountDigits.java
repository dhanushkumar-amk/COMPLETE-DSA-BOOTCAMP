package STRIVER_SHEET;

public class CountDigits {
    public static void main(String[] args) {
        int n = 123456;
        System.out.println(countDigit(n));
    }

    public static int countDigit(int n){
        int count = 0;
        while(n > 0){
            int lastDigit = n % 10;
            count++;
            n = n/10;
        }
        return count;
    }

}
