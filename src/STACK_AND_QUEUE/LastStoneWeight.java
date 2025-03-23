package STACK_AND_QUEUE;


// leetcode : 1046
// https://leetcode.com/problems/last-stone-weight/description/


import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class LastStoneWeight {

    public static void main(String[] args) {
        LastStoneWeight answer = new LastStoneWeight();
        int[] stones = {2,7,4,1,8,1};
        System.out.println(answer.lastStoneWeight(stones));
    }

    public int lastStoneWeight(int[] stones) {

        // step1 init the priority queue stores all the element in reverse order
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());

        // step 2 add all elements to a priority queue
        for (int stone : stones)
            priorityQueue.add(stone);

        // step 3 get the largest element  and take difference and also add it to the queue
        while (priorityQueue.size() > 1){

            int firstGreatest = priorityQueue.poll();
            int secondGreatest = priorityQueue.poll();

            // not equal means take difference and add it to the queue otherwise it is equal then simply ignore it
            if (firstGreatest != secondGreatest) {
                int difference = firstGreatest - secondGreatest;
                priorityQueue.add(difference);
            }
        }
        return priorityQueue.isEmpty() ? 0 : priorityQueue.poll();
    }
}
