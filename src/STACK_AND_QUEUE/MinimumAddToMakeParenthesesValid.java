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

                // two choices left or right
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

                // two choices
                if (stack.isEmpty()){

                    //if stack is empty then add pne left parentheses
                    countInsertion++;
                    stack.add('(');
                    stack.add(ch); //ch is a right parenthesis
                }
                else{
                    // it is not empty then it has two choices left or right
                    if (stack.peek() == '('){
                        stack.add(ch);
                    }else{
                        stack.pop();
                        stack.pop();
                    }
                }



            }
        }
        return countInsertion;

    }
}
