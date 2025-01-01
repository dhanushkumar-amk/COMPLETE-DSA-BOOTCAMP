package STACK_AND_QUEUE;


import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {

//        Queue<Integer> queue = new LinkedList<>();
//
//        queue.add(1);
//        queue.add(2);
//        queue.add(3);
//        queue.add(4);
//        queue.add(5);

//        System.out.println(queue.peek());
//        System.out.println(queue.remove());
//        System.out.println(queue.poll());


        // Deque
        // insert and remove from both side

        Deque<Integer> dq = new ArrayDeque<>();
        dq.addFirst(1);
        dq.addLast(2);
        dq.add(3);
        dq.add(4);







    }
}
