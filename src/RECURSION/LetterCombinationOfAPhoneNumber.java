package RECURSION;

public class LetterCombinationOfAPhoneNumber {

    static String[] keypad = {"", "", "abc", "def", "ghi", "jkl","mno", "pqrs", "tuv", "wxyz"};

    public static void main(String[] args) {
        String s = "46";
        possibleWords(s, "");
    }

    static void possibleWords(String s, String answer){

        // base case
        if (s.length() == 0){
            System.out.println(answer);
            return;
        }

            String key = keypad[s.charAt(0) - 48];

        for (int i = 0; i < key.length() - 1 ; i++) {
            possibleWords(s.substring(1), answer+s.charAt(i));
        }

    }
}
