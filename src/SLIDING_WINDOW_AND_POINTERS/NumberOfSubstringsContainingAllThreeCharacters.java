package SLIDING_WINDOW_AND_POINTERS;

// Leetcode 1358
// https://leetcode.com/problems/number-of-substrings-containing-all-three-characters/description/?envType=daily-question&envId=2025-03-11

public class NumberOfSubstringsContainingAllThreeCharacters {

    public int numberOfSubstrings(String s) {

        int left = 0;
        int right = 0;
        int validSubStringCount = 0;

        int[] charFrequency = new int[3];

        while (right < s.length()) {
            // Increment the frequency of the character at the 'right' pointer
            charFrequency[s.charAt(right) - 'a']++;

            // Check if the current window contains all three characters
            while (charFrequency[0] > 0 && charFrequency[1] > 0 && charFrequency[2] > 0) {
                // If the current window is valid, count the valid substrings
                validSubStringCount += s.length() - right;

                // Shrink the window from the left side
                charFrequency[s.charAt(left++) - 'a']--;
            }
            right++;
        }
        return validSubStringCount;
    }
}
