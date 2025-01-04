package STACK_AND_QUEUE;

import java.util.Stack;

public class DecodeString {
    public static void main(String[] args) {
    String s = "3[a]2[bc]";
        System.out.println(decodeString(s));
    }

    public static String decodeString(String s) {
        Stack<String> stringstack = new Stack<>();
        Stack<Integer> numberStack = new Stack<>();
        int k = 0;


        for(char ch : s.toCharArray()) {

            if (Character.isDigit(ch)) {
                k = (k * 10) + (ch - '0');
                continue;
            }

            if (ch == '[') {
                numberStack.push(k);
                k = 0;
                stringstack.push(String.valueOf(ch));
                continue;
            }

            if (ch != ']') {
                stringstack.push(String.valueOf(ch));
                continue;
            }

            StringBuilder temp = new StringBuilder();

            while (!stringstack.peek().equals("["))
                temp.insert(0, stringstack.pop());

            stringstack.pop();

            StringBuilder replacement = new StringBuilder();
            int count = numberStack.pop();

            for (int i = 0; i < count; i++)
                replacement.append(temp);

            stringstack.push(replacement.toString());

        }
            StringBuilder result = new StringBuilder();

            while (!stringstack.empty())
                result.insert(0, stringstack.pop());

            return result.toString();


    }
}