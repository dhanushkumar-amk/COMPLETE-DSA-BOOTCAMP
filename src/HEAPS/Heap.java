package HEAPS;


import java.util.ArrayList;

public class Heap<T extends  Comparable<T>> {

    private ArrayList<T> list;

    public Heap() {
        list = new ArrayList<>();
    }


    // parent
    private int parent(int index){
        return  (index - 1)/2;
    }

    // left
    private int left(int index){
        return (index * 2) + 1;
    }

    // right
    private int right(int index){
        return (index * 2) + 2;
    }


    // insert
    public  void insert(T value){
        // add the element in last
        list.add(value);

        // search towards up and swap
        upHeap(list.size() - 1);
    }

    // upHeap
    private void upHeap(int index) {

        if (index == 0) return;

        int p = parent(index);

        if (list.get(index).compareTo(list.get(p)) < 0){
            swap(index, p);
            upHeap(p);
        }
    }

    // remove
    private T remove() throws Exception{

        if (list.isEmpty()){
            throw new Exception("Removing from the empty heap");
        }

        // return 0th index
        T temp = list.get(0);

        // swap the last index with oth index
        T last = list.remove(list.size()- 1);

        if (!list.isEmpty()){
            list.set(0, last);
        }

        return temp;
    }


    // swap function
    private void swap(int first, int second) {
        T temp = list.get(first);
        list.set(first, list.get(second));
        list.set(second, temp);
    }
}



class main{

}
