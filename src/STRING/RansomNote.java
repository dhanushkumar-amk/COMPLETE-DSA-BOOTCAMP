package HASHMAPS;


// leetcode : 383
// https://leetcode.com/problems/ransom-note/description/

public class RansomNote {

    public static void main(String[] args) {
        RansomNote answer = new RansomNote();
        String ransomNote = "aa";
        String magazine = "abaababab";
        System.out.println(answer.canConstruct(ransomNote, magazine));
    }

    public boolean canConstruct(String ransomNote, String magazine) {

        int[] charCount = new int[26];

        for(char ch : magazine.toCharArray())
            charCount[ch - 'a']++;

        for(char character : ransomNote.toCharArray()){
            if (charCount[character - 'a'] == 0)
                return false;

            charCount[character - 'a']--;

        }
        return true;
    }
}
