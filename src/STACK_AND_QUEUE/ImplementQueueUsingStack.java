package STACK_AND_QUEUE;

// leetcode 232

import java.util.Stack;


public class ImplementQueueUsingStack {
    public static void main(String[] args) {



    }



}

class  QueueUsingStack{
    private Stack<Integer> first;
    private Stack<Integer> second;


    public QueueUsingStack() {
        first = new Stack<>();
        second = new Stack<>();
    }


    // add element
    public void push(int item){
        first.push(item);
    }


    // remove elements
    public int pop() {

        while (!first.isEmpty()){
            int popped = first.pop();
            second.push(popped);
        }

        int removed = second.pop();

        while (!second.isEmpty()){
            int popped = second.pop();
            first.push(popped);
        }
        return removed;
    }


    public boolean empty() {
        return first.empty();
    }

    

}