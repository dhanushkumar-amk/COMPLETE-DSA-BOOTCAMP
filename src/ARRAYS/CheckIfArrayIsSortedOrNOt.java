package ARRAYS;

public class CheckIfArrayIsSortedOrNOt {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        System.out.println(isSorted(arr));

    }
    static boolean isSorted(int[] arr){

        for (int i = 1; i <arr.length ; i++) {
            if (arr[i] < arr[i - 1])
                return false;
        }
        return true;
    }
}
