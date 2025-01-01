package STACK_AND_QUEUE;

// leetcode 232

import java.util.Stack;


public class ImplementQueueUsingStack {
    public static void main(String[] args) {



    }



}

class  MyQueue{
    private Stack<Integer> first;
    private Stack<Integer> second;


    public MyQueue() {
        first = new Stack<>();
        second = new Stack<>();
    }


    // add element
    public void push(int item){
       while (!first.empty()){
           int added = first.pop();
           second.push(added);
       }
       first.push(item);

        while (!second.empty()){
            int added = second.pop();
            first.push(added);
        }
    }


    // remove elements
    public int pop() {
       return first.pop();
    }


    public boolean empty() {
        return first.empty();
    }

    public int peek() {
        return first.peek();
    }

}