package SLIDING_WINDOW_AND_POINTERS;

// leetocde 1358
// https://leetcode.com/problems/number-of-substrings-containing-all-three-characters/description/?envType=daily-question&envId=2025-03-11

public class NumberOfSubstringsContainingAllThreeCharacters {

    public int numberOfSubstrings(String s) {

        int left = 0;
        int right = 0;
        int validSubStringCount = 0;

        int[] charFrequency = new int[3];

        while (right < s.length()){
            charFrequency[s.charAt(right) - 'a']++;

            while (charFrequency[0] && charFrequency[1] && charFrequency[2]){
                validSubStringCount += s.length() - right;
                charFrequency[s.charAt(left++) - 'a']--;
            }
            right++;
        }
        return validSubStringCount;
    }

}
