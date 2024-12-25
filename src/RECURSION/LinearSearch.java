package RECURSION;

public class LinearSearch {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        System.out.println(search(arr, 41, 0));
    }
    static boolean search(int [] arr, int target, int i){

        if (i == arr.length - 1)
            return false;

        return arr[i] == target || search(arr, target, i+1);
    }
}
