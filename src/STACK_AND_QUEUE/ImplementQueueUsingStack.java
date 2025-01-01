package STACK_AND_QUEUE;

// Code 232

import java.util.Stack;


public class ImplementQueueUsingStack {
    public static void main(String[] args) {

        MyQueue queue = new MyQueue();

        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);


        System.out.println("-----------");

        queue.push(5);

        System.out.println(queue.pop());


    }



}

class  MyQueue{
    private static Stack<Integer> first;
    private static Stack<Integer> second;


    public MyQueue() {
        first = new Stack<>();
        second = new Stack<>();
    }


    // add element
    public static void push(int item){
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
    public static int pop() {
       return first.pop();
    }


    public static boolean empty() {
        return first.empty();
    }

    public static int peek() {
        return first.peek();
    }

}