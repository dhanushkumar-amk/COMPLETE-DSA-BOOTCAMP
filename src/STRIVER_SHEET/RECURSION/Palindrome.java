package STRIVER_SHEET.RECURSION;

public class Palindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome(0, "madam", "madam".length()));
    }

    static boolean isPalindrome(int index, String s, int n){

        if(index >= n / 2)
            return true;

        if(s.charAt(index) != s.charAt(n - index - 1))
            return false;

        return isPalindrome(index + 1, s, n);

    }
}
