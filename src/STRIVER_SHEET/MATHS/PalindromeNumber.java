package STRIVER_SHEET.MATHS;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(123));
    }

    public static boolean isPalindrome(int x) {
        int n = x;

        int temp = 0;
        while(n != 0){
            int rem = n % 10;
            temp = temp * 10 + rem;
            n = n / 10;
        }

        return temp == x ?  true :  false;

    }
}
