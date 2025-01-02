package STACK_AND_QUEUE;

import java.util.Stack;

public class MinimumInsertionsToBalanceAParenthesesString {

    public static void main(String[] args) {
        String s = "{}}";
        System.out.println(minInsertions(s));
    }
    static  int minInsertions(String s){

        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()){
            if (ch == '}'){
                if (!stack.isEmpty() || stack.peek() == '{')
                    stack.pop();
                else
                    stack.push(ch);
            }else
                stack.push(ch);
        }
        return stack.size();
    }
}
