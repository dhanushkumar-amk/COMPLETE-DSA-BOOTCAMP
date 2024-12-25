package RECURSION;

public class PalindromeNumberOrNot {
    public static void main(String[] args) {

    }

    static boolean isPalindrome(int n){
        return n == reverse(n);
    }

    static void reverse(int n){
        if (n % 10 == n)
            return;
    }

}
