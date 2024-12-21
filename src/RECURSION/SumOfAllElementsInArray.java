package RECURSION;

public class SumOfAllElementsInArray {
    public static void main(String[] args) {
       int[] arr = {1,2,3,4};
       int i = arr.length - 1;
        System.out.println(sum(arr, i));
    }
    static int sum(int[] arr, int i){


        if (i < 0)
            return 0;

        return sum(arr, i -1) +arr[i];
    }
}
