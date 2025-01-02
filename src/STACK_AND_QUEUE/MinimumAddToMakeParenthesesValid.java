package STACK_AND_QUEUE;

import java.util.Stack;

public class MinimumAddToMakeParenthesesValid {
    public static void main(String[] args) {
        String s = "(()))";
        System.out.println(minAddToMakeValid(s));
    }


    static int minAddToMakeValid(String s){

        Stack<Character> stack = new Stack<>();
        int countInsertion = 0;

        for (int i = 0; i <s.length() ; i++) {
            char ch = s.charAt(i);

            // have two choices left parenthesis or right parenthesis

            if (ch == '('){

                if (stack.isEmpty()){
                    stack.push(ch);
                }
                else{
                    if (stack.peek() != '(') {
                        countInsertion++;
                        stack.pop();
                        stack.pop();
                    }
                    stack.add(ch);
                }
            }
            else{



            }
        }

    }
}
