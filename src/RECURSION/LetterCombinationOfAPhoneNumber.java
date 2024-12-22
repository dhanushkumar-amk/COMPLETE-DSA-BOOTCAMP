package RECURSION;

import java.util.ArrayList;

public class LetterCombinationOfAPhoneNumber {

    static String[] keypad = {"", "", "abc", "def", "ghi", "jkl","mno", "pqrs", "tuv", "wxyz"};
    static ArrayList<String> list = new ArrayList<>();

    public static void main(String[] args) {
        String s = "46";
        possibleWords(s, "");
        System.out.println(list);
    }

    static void possibleWords(String s, String answer){

        // base case
        if (s.length() == 0){
            list.add(answer);
            return;
        }

            String key = keypad[s.charAt(0) - 48];

        for (int i = 0; i < key.length() ; i++) {
            possibleWords(s.substring(1), answer+key.charAt(i));
        }

    }
}
