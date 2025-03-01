package SLIDING_WINDOW_AND_POINTERS;

// leetcode 3174;
// https://leetcode.com/problems/clear-digits/description/

import java.util.Stack;

public class ClearDigits {

    public String clearDigits(String s) {
        Stack<Character> characterStack = new Stack<>();
        for (char character : s.toCharArray()) {
            if (Character.isDigit(character)) {
                characterStack.pop();
            } else {
                characterStack.push(character);
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!characterStack.isEmpty()) {
            sb.append(characterStack.pop());
        }
        return sb.reverse().toString();
    }
}
