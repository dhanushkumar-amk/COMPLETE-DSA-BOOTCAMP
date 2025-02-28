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
