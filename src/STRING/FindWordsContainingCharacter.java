package STRING;

//leetcode : 2942
// https://leetcode.com/problems/find-words-containing-character/description/?envType=daily-question&envId=2025-05-24

import java.util.ArrayList;
import java.util.List;

public class FindWordsContainingCharacter {
    public static void main(String[] args) {

    }
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (words[i].indexOf(x) != -1)
                ans.add(i);
        }
        return ans;
    }
}