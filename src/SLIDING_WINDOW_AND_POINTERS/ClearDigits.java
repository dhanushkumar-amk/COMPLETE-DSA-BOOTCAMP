package SLIDING_WINDOW_AND_POINTERS;

// leetcode 3174;
// https://leetcode.com/problems/clear-digits/description/

import java.util.Stack;

public class ClearDigits {

    public static void main(String[] args) {

    }

    public static String clearDigits(String s) {
        Stack<Character> characterStack = new Stack<>();

        // step 1
        for (char character : s.toCharArray()) {
            if (Character.isDigit(character)) {
                characterStack.pop();
            } else {
                characterStack.push(character);
            }
        }

        // step 2
        StringBuilder sb = new StringBuilder();
        while (!characterStack.isEmpty()) {
            sb.append(characterStack.pop());
        }

        // step 3
        return sb.reverse().toString();
    }
}
