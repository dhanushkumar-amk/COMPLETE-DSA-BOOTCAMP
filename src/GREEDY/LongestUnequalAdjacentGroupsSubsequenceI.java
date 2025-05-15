package GREEDY;

// leetcode : 2900
// https://leetcode.com/problems/longest-unequal-adjacent-groups-subsequence-i/description/?envType=daily-question&envId=2025-05-15


import java.util.ArrayList;
import java.util.List;

public class LongestUnequalAdjacentGroupsSubsequenceI {
    public static void main(String[] args) {

    }

    public List<String> getLongestSubsequence(String[] words, int[] groups) {

        List<String> answer = new ArrayList<>();
        int n = groups.length;

        for (int i = 1; i <= n; i++) {
            if (groups[i] != groups[ i - 1])
                answer.add(words[i]);
        }
        return answer;
    }

}