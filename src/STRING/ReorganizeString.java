package STRING;

// https://leetcode.com/problems/reorganize-string/description/
// leetcode 767

public class ReorganizeString {

    public static void main(String[] args) {
        ReorganizeString answer = new ReorganizeString();
        String s = "aab";
        System.out.println(answer.reorganizeString(s));
    }

    public String reorganizeString(String s) {
        int[] hash = new int[26];

        for (int i = 0; i < s.length(); i++)
            hash[s.charAt(i) - 'a']++;

        int max = 0;
        int letter = 0;

        for (int i = 0; i < hash.length; i++) {
            if (hash[i] > max) {
                max = hash[i];
                letter = i;
            }
        }

        if (max > (s.length() + 1 ) / 2 )
            return "";

        char[] result = new char[s.length()];

        int index = 0;
        while (hash[letter]-- > 0){
            result[index] = (char) (letter + 'a');
            index += 2;
        }

        for (int i = 0; i < hash.length; i++) {
            while (hash[i]--  > 0){
                if (index >= result.length)
                    index = 1;

                result[index] = (char) (i + 'a');
                index += 2;
            }
        }
        return String.valueOf(result);
    }

}
