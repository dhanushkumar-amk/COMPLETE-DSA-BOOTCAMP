package DYNAMIC_PROGRAMMING.BASED_ON_STRINGS;


// https://leetcode.com/problems/word-break/
// leetcode 139

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordBreak {


    public boolean wordBreak(String s, List<String> wordDict) {

        // convert the dictionary to a set
        Set<String> wordSet = new HashSet<>(wordDict);

        // find the maximum word length in the dictionary
        int maxLength = 0;
        for (String word : wordDict)
            maxLength = Math.max(maxLength, word.length());

        // create the dp array
        int n = s.length();
        boolean[] dp = new boolean[n + 1]; // for zero based indexing

        dp[0] = true; // make it as true as first character

        for (int i = 1; i <= n; i++) {
            for (int j = i - 1; j >= Math.max(0, i - maxLength); j++) {
                if (dp[j] && wordSet.contains(s.substring(j, i))){
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[n];
    }
}

/*
package DYNAMIC_PROGRAMMING.BASED_ON_STRINGS;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordBreak {

    public boolean wordBreak(String s, List<String> wordDict) {
        // Convert the dictionary to a set for O(1) lookups
        Set<String> wordSet = new HashSet<>(wordDict);

        // Find the maximum word length in the dictionary
        int maxLength = 0;
        for (String word : wordDict) {
            maxLength = Math.max(maxLength, word.length());
        }

        // Create a memoization array to store the results of subproblems
        Boolean[] memo = new Boolean[s.length() + 1];

        // Start the recursive process
        return canBreak(s, 0, wordSet, maxLength, memo);
    }

    private boolean canBreak(String s, int start, Set<String> wordSet, int maxLength, Boolean[] memo) {
        // If we have reached the end of the string, return true
        if (start == s.length()) {
            return true;
        }

        // If the result is already computed, return it
        if (memo[start] != null) {
            return memo[start];
        }

        // Try all possible substrings starting from 'start'
        for (int end = start + 1; end <= s.length() && end - start <= maxLength; end++) {
            String substring = s.substring(start, end);
            if (wordSet.contains(substring) && canBreak(s, end, wordSet, maxLength, memo)) {
                // If the substring is in the dictionary and the remaining string can be broken, return true
                memo[start] = true;
                return true;
            }
        }

        // If no valid break is found, return false
        memo[start] = false;
        return false;
    }
}
 */