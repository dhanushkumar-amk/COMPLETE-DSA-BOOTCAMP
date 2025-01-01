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


    public boolean insert(int item){
        if (isFull())
            return false;

        data[end]


    }



}
