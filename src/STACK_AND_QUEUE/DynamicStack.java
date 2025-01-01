package STACK_AND_QUEUE;

public class DynamicStack  extends CustomStack{
    public DynamicStack() {
        super(); // it will call customStack
    }

    public DynamicStack(int size) {
        super(size);
    }

    // the only problem is push because it is dynamic size stack

    @Override
    public boolean push(int item) {
        if (this.isFull()){
            // is full then doubled the size of an array
            int[] temp = new int[data.length * 2];

            // copy call previous element in new temp array\
            for (int i = 0; i < data.length ; i++) {
                temp[i] = data[i];
            }

            data = temp;
        }

        // insert items

        return super.push(item);
    }
}
