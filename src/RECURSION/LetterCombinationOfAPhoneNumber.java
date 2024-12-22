package RECURSION;

public class LetterCombinationOfAPhoneNumber {

    static String[] keypad = {"", "", "abc", "def", "ghi", "jkl","mno", "pqrs", "tuv", "wxyz"};

    public static void main(String[] args) {

    }

    static void possibleWords(String s, String answer){

        // base case
        if (s.length() == 0){
            System.out.println(answer);
            return;
        }

            int key = keypad[s.charAt(0) - 48];

        for (int i = 0; i < ; i++) {
            
        }

    }
}
