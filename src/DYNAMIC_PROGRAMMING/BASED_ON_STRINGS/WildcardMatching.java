package DYNAMIC_PROGRAMMING.BASED_ON_STRINGS;

public class WildcardMatching {

    public boolean isMatch(String string, String pattern) {

        int n = pattern.length();
        int m = string.length();

        return function(n - 1, m - 1, string, pattern);

    }

    private boolean function(int i, int j, String string, String pattern) {

        // base case
        if (i < 0  && j < 0)
            return true;

        if (i < 0 && j >= 0)
            return false;

        if (j < 0 && i >= 0){
            for (int k = 0; k <= i; k++) {
                if (pattern.charAt(i) != '*')
                    return false;
            }
            return true;
        }

        if (pattern.charAt(i) == string.charAt(j) ||  pattern.charAt(i) == '?')
            return function(i - 1, j - 1, string, pattern);

        if (pattern.charAt(i) == '*')
            return function(i - 1, j, string, pattern) || function(i, j -1, string, pattern);

        // not match
        return false;
    }
}
