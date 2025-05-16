package STRING;

// leetcode : 1859
//https://leetcode.com/problems/sorting-the-sentence/description/

import java.util.HashMap;
import java.util.Map;

public class SortingTheSentence {
    public static void main(String[] args) {
        SortingTheSentence answer = new SortingTheSentence();
        String s = "is2 sentence4 This1 a3";
        System.out.println(answer.sortSentence(s));
    }

    public String sortSentence(String s) {
        Map<Integer, String> map = new HashMap<>();

        for(String word : s.split(" ")){
            int lastIndex = word.length() - 1;

            int index = word.charAt(lastIndex) - '0';
            String actualWord = word.substring(0, lastIndex);

            map.put(index, actualWord);
        }

        StringBuilder answer = new StringBuilder();
        for(Map.Entry<Integer, String> indexWord : map.entrySet()){
            answer.append(indexWord.getValue());
            answer.append(" ");
        }
        return answer.toString().trim();
    }
}
