package OOPS.GENERIC;


import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList {



    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;


    public CustomArrayList() {
        this.data = new int[DEFAULT_SIZE];
    }

    // add method
    public void add(int num){
        if (isFull()){
            resize();
        }

        data[size++] = num;

    }


    private void resize() {
        int[]  temp = new int[data.length * 2];

        // copy the current item into the new array

        for (int i = 0; i < data.length ; i++) {
            temp[i] = data[i];
        }

        data = temp;
    }



    public  boolean isFull(){
        return size == data.length;
    }

    public int remove(){
        int removedItem = data[--size];
        return removedItem;
    }

    public int get(int index){
        return data[index];
    }

    public  int size(){
        return size;
    }

    public void set(int index, int value){
        data[index] = value;
    }


    @Override
    public String toString() {
        return  Arrays.toString(data) + " \n" + size;
    }

    public static void main(String[] args) {

/*
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.remove(1);
        list.set(1, 234);
*/

        CustomArrayList list = new CustomArrayList();

        for (int i = 0; i < 20 ; i++) {
            list.add(i);
        }
        System.out.println(list);


        // internal arraylist
        

    }
}
