package RECURSION;

public class LinearSearch {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        System.out.println(searchFromLast(arr, 4, 0));
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
        if (i == 0)
            return -1;

        if (arr[i] == target)
            return i;
        else
            return searchFromLast(arr, target, i - 1);
    }

    // return as a list


}
