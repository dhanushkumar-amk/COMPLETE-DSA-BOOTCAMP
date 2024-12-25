package RECURSION;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {

//        int[] arr = {1,2,3,4,5};
        int[] arr = {1,2,3,4,4,5};
//        System.out.println(searchFromLast(arr, 4, arr.length -1));
        findAllIndex(arr,4,0);
        System.out.println(list);
    }

    // basic linear search
    static boolean search(int [] arr, int target, int i){

        if (i == arr.length)
            return false;

        return arr[i] == target || search(arr, target, i+1);
    }

    // return an index value
    static int search1(int[] arr, int target, int i){
        if (i == arr.length)
            return -1;

        if (arr[i] == target)
            return i;
        else
            return search1(arr, target, i + 1);
    }

    // search from last
    static int searchFromLast(int[] arr, int target, int i){
        if (i == -1)
            return -1;

        if (arr[i] == target)
            return i;
        else
            return searchFromLast(arr, target, i - 1);
    }

    // return as a list of all index

    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int[] arr, int target, int i){

        if (i == arr.length)
            return;

        if (arr[i] == target)
            list.add(i);

        findAllIndex(arr,target, i+ 1);
    }


    // return an array list within an function


}
