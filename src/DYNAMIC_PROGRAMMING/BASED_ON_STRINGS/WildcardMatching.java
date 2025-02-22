package DYNAMIC_PROGRAMMING.BASED_ON_STRINGS;

public class WildcardMatching {

    public boolean isMatch(String string, String pattern) {

        int n = pattern.length();
        int m = string.length();

        return function(n - 1, m - 1, string, pattern);

    }
}
