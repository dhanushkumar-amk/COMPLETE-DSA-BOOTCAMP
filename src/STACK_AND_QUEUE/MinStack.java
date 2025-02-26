package STACK_AND_QUEUE;

// leetcode : 155
// https://leetcode.com/problems/min-stack/


import java.util.Stack;

public class MinStack {


    Stack<Integer> orginalStack;
    Stack<Integer> minStack;

    public MinStack() {
        orginalStack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {
        orginalStack.push(val);

        if (minStack.isEmpty() || val <= minStack.peek())
            minStack.push(val);
    }

    public void pop() {

    }

    public int top() {

    }

    public int getMin() {

    }

}
