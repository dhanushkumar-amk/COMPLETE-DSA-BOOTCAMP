package STACK_AND_QUEUE;

public class CircularQueue {

    protected   int[] data;
    private static  final int DEFAULT_SIZE = 10;

    protected int front = 0;
    protected int end = 0;
    private int size = 0;

    public CircularQueue() {
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int size) {
        this.data = new int[size];
    }

    // is full
    public boolean isFull(){
        return size == data.length;  // pointer in the last index``
    }

    // is empty
    public boolean isEmpty(){
        return size == 0;
    }

    // insert the element in queue at the end   tC = O(n)
    public boolean insert(int item){
        if (isFull())
            return false;

        data[end] = item;
        end++;
        end = end % data.length; // for going 5 to 0 again as a circular queue
        size++;
        return true;
    }


    // remove the elements
    public int remove() throws Exception{
        if (isEmpty())
            throw new Exception("Queue is empty");

        int removed = data[front];

        front = front % data.length;
        size--;
        front++;

        return removed;

    }

    // get the first element
    public int front() throws Exception{
        if (isEmpty())
            throw new Exception("Queue is empty");

        return data[front];
    }


    // display function
    public  void display(){
        for (int i = front; i <= end; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println("END");
    }

}
