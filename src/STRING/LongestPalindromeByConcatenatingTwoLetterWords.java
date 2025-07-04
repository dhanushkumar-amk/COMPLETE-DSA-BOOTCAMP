package STRING;


// leetcode : 2131
// https://leetcode.com/problems/longest-palindrome-by-concatenating-two-letter-words/description/?envTykpe=daily-question&envId=2025-05-25

import java.util.HashMap;
import java.util.Map;

public class LongestPalindromeByConcatenatingTwoLetterWords {

    public static void main(String[] args) {
        LongestPalindromeByConcatenatingTwoLetterWords ans = new LongestPalindromeByConcatenatingTwoLetterWords();
        String[] words = {"lc","cl","gg"};
        System.out.println(ans.longestPalindrome(words));
    }

    public int longestPalindrome(String[] words) {

        // create the map for frequency and increase the frequency
        Map<String, Integer> frequencyMap = new HashMap<>();
        for(String word : words)
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);

        int length = 0;

        for(String word : words){

            if(frequencyMap.get(word) <= 0)
                continue;

            // reverse a word
            char[] temp = new char[2];
            temp[0] = word.charAt(1);
            temp[1] = word.charAt(0);

            String reverseWord =new String(temp);

            // same word used twice
            if (temp[0] == temp[1] && frequencyMap.get(reverseWord) == 1)
                continue;

            // otherwise it will be use, the decrement the frequency
            if(frequencyMap.containsKey(reverseWord) && frequencyMap.get(reverseWord) > 0){
                length += 4;

                frequencyMap.put(word, frequencyMap.get(word) - 1);
                frequencyMap.put(reverseWord, frequencyMap.get(reverseWord) - 1);
            }
        }

        // after there is any key present on the hashmap then both values is present equal then add +2 on it
        for(String k : frequencyMap.keySet()){
            if(frequencyMap.get(k) > 0 && k.charAt(0) == k.charAt(1)){
                length += 2;
                break;
            }
        }
        return length;
    }
}