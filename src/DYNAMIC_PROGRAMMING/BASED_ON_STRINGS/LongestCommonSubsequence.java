package DYNAMIC_PROGRAMMING.BASED_ON_STRINGS;

public class LongestCommonSubsequence {

    public static void main(String[] args) {

    }

   public static int longestCommonSubsequence(String text1, String text2) {

        int n = text1.length();
        int m = text2.length();

        return function(n - 1, m -1, text1, text2);
    }

    private static int function(int i, int j, String text1, String text2) {

        // base case
        if (i < 0 || j < 0)
            return 0;


        if (text1.charAt(i) == text2.charAt(j))
            return 1 + function(i -1, j - 1, text1, text2);


        return 0 + Math.max(function(i -1, j, text1, text2), function(i, j -1, text1, text2));

    }
}
