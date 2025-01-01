package STACK_AND_QUEUE;


import java.util.*;

public class QueueExample {
    public static void main(String[] args) throws Exception {

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



        // custom queue implementation

        CustomQueue queue1 = new CustomQueue();

        queue1.insert(111);
        queue1.insert(222);
        queue1.insert(333);
        queue1.insert(444);
        queue1.insert(555);


        System.out.println(queue1.remove());
//        System.out.println(queue1.remove());
//        System.out.println(queue1.remove());


        System.out.println(queue1.front());



        queue1.display();


        CircularQueue CQueue = new CircularQueue();

        CQueue.insert(101);
        CQueue.insert(102);
        CQueue.insert(103);
        CQueue.insert(104);

        CQueue.display();


    }
}
