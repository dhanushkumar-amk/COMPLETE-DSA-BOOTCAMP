package STACK_AND_QUEUE;

import java.util.Stack;

public class UsingARobotToPrintTheLexicographicallySmallestString {
    public static void main(String[] args) {
        UsingARobotToPrintTheLexicographicallySmallestString answer = new UsingARobotToPrintTheLexicographicallySmallestString();
    }

    public String robotWithString(String s) {
        int[] freq = new int[26];
        for (char c : s.toCharArray())
            freq[c - 'a']++;

        Stack<Character> stack = new Stack<>();
        StringBuilder result = new StringBuilder();

        char  minCharacter = 'a';

        for(char c : s.toCharArray()){
            stack.push(c);
            freq[c - 'a']--;

            while(minCharacter != 'z' && freq[minCharacter - 'a'] == 0)
                minCharacter++;

            while (!stack.isEmpty() && stack.peek() <= minCharacter){
                result.append(stack.pop());
            }
        }
        return result.toString();
    }
}
