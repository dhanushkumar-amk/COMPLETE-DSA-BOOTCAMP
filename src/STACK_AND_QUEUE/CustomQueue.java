package STACK_AND_QUEUE;

public class CustomQueue {

   private  int[] data;
    private static  final int DEFAULT_SIZE = 10;


    int end = 0;

    public CustomQueue() {
        this(DEFAULT_SIZE);
    }

    public CustomQueue(int size) {
        this.data = new int[size];
    }

    // is full
    public boolean isFull(){
        return end == data.length;  // pointer in the last index``
    }

    // is empty
    public boolean isEmpty(){
        return end == 0;
    }


    // insert the element in queue at the end   tC = O(n)
    public boolean insert(int item){
        if (isFull())
            return false;

        data[end] = item;
        end++;
        return true;
    }

    // remove the item from the first
    // actually shifting one to the left from the first then it automatically removes  TC= O(n)
    public int remove() throws Exception{
        if (isEmpty())
            throw new Exception("Queue is empty");

        int removed = data[0];

        //shift the elements to the left

        for (int i = 1; i <end; i++) {
            data[i - 1] = data[i];
        }
        end--;
        return removed;

    }


    // get the first element
    public int front() throws Exception{
        if (isEmpty())
            throw new Exception("Queue is empty");

        return data[0];
    }


    // display function
    public  void display(){
        for (int i = 0; i <end; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println(end);
    }


}
