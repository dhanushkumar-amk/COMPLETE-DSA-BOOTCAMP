package DYNAMIC_PROGRAMMING.BASED_ON_SUBSEQUENCE;

// leetcode : 2901
// https://leetcode.com/problems/longest-unequal-adjacent-groups-subsequence-ii/description/?envType=daily-question&envId=2025-05-16

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LongestUnequalAdjacentGroupsSubsequenceIi {

    public static void main(String[] args) {
        LongestUnequalAdjacentGroupsSubsequenceIi answer = new LongestUnequalAdjacentGroupsSubsequenceIi();
        String[] words = {"a", "b", "c", "d"};
        int[] groups = {1, 2, 3, 4};
        System.out.println(answer.getWordsInLongestSubsequence(words, groups));
    }

    public List<String> getWordsInLongestSubsequence(String[] words, int[] groups) {
        int n = groups.length;

        int[] dp = new int[n];
        int[] prev = new int[n];
        Arrays.fill(dp, 1);
        Arrays.fill(prev, -1);

        int mxIndex = 0;

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (check(words[i], words[j]) && dp[j] + 1 > dp[i] && groups[i] != groups[j]) {
                    dp[i] = dp[j] + 1;
                    prev[i] = j;
                }
            }
            if (dp[i] > dp[mxIndex])
                mxIndex = i;

        }

        List<String> answer = new ArrayList<>();
        for (int j = mxIndex; j >= 0; j = prev[j]) {
            answer.add(words[j]);
        }
        Collections.reverse(answer);
        return answer;
    }



    private boolean check(String s1, String s2){
        if (s1.length() != s2.length())
            return false;

        int difference = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                difference++;
                if (difference > 1)
                    return false;
            }
        }
        return difference == 1;
    }


}
