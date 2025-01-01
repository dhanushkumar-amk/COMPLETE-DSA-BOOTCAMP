package STACK_AND_QUEUE;

import java.util.*;

public class StackExample {
    public StackExample() {
    }

    public static void main(String[] args) throws CustomStackException {

        Stack<Integer> stack = new Stack();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);


        System.out.println(stack.pop());  // return as a integer
        System.out.println(stack.pop());  // return as a integer
        System.out.println(stack.pop());  // return as a integer
        System.out.println(stack.pop());  // return as a integer
        System.out.println(stack.pop());  // return as a integer
        System.out.println(stack.pop());  // return as a integer


        // output:
        // 6,5,4,3,2,1


        CustomStack stack1 = new CustomStack(5);
        stack1.push(6);
        stack1.push(7);
        stack1.push(8);
        stack1.push(9);
        stack1.push(10);

        System.out.println(stack1.pop());
        System.out.println(stack1.pop());
        System.out.println(stack1.pop());
        System.out.println(stack1.pop());
        System.out.println(stack1.pop());




    }
}
