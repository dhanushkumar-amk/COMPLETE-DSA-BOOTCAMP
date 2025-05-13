package STRING;

// leetcode 3335
// https://leetcode.com/problems/total-characters-in-string-after-transformations-i/description/?envType=daily-question&envId=2025-05-13

public class TotalCharactersInStringAfterTransformationsI {
    public static void main(String[] args) {
        TotalCharactersInStringAfterTransformationsI answer = new TotalCharactersInStringAfterTransformationsI();
        String s = "abcyy";
        int t = 2;
        System.out.println(answer.lengthAfterTransformations(s,t));
    }


    private static final int MOD = 1_000_000_007;
    public int lengthAfterTransformations(String s, int t) {

        int[] frequency = new int[26];
        for(char c : s.toCharArray())
            frequency[c - 'a']++;

        while (t-- > 0) {
            int[] next = new int[26];
            for (int j = 0; j < 26; j++) {
                if (j < 25) {
                    next[j + 1] = frequency[j];
                } else {
                    // 'z' → 'a' and also contributes to 'b'
                    next[0] = frequency[25];
                    next[1] = addMod(next[1], frequency[25]);
                }
            }
            frequency = next;
        }

    }

    private int addMod(int a, int b) {
        a += b;
        if (a >= MOD) a -= MOD;
        return a;
    }
}