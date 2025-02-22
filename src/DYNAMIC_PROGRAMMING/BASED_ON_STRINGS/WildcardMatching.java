package DYNAMIC_PROGRAMMING.BASED_ON_STRINGS;


public class WildcardMatching {

        public boolean isMatch(String string, String pattern) {
            int n = pattern.length();
            int m = string.length();
            Boolean[][] dp = new Boolean[n + 1][m + 1]; // Memoization table
            return function(n - 1, m - 1, string, pattern, dp);
        }

        private boolean function(int i, int j, String string, String pattern, Boolean[][] dp) {
            // Base cases
            if (i < 0 && j < 0)
                return true;

            if (i < 0 && j >= 0)
                return false;

            // Pattern exhausted but string remains
            if (j < 0 && i >= 0) { // If string is exhausted, remaining pattern should be all '*'
                for (int k = 0; k <= i; k++) {
                    if (pattern.charAt(k) != '*')
                        return false;
                }
                return true;
            }

            // Memoization check
            if (dp[i][j] != null) return dp[i][j];

            // If characters match or pattern has '?'
            if (pattern.charAt(i) == string.charAt(j) || pattern.charAt(i) == '?') {
                return dp[i][j] = function(i - 1, j - 1, string, pattern, dp);
            }

            // If pattern has '*', try two cases:
            if (pattern.charAt(i) == '*') {
                return dp[i][j] = function(i - 1, j, string, pattern, dp) || function(i, j - 1, string, pattern, dp);
            }

            // Characters do not match
            return dp[i][j] = false;
        }
}
