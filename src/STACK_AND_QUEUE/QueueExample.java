package STACK_AND_QUEUE;


import java.util.*;

public class QueueExample {
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        System.out.println(queue.peek());
        System.out.println(queue.remove());
        System.out.println(queue.poll());


        // Deque
        // insert and remove from both side

        Deque<Integer> dq = new ArrayDeque<>();


        dq.add(1);
        dq.addFirst(2);
        dq.addLast(3);
        dq.removeFirst();
        dq.removeLast();
        System.out.println(dq);



        CustomQueue queue1 = new CustomQueue();


    }
}
