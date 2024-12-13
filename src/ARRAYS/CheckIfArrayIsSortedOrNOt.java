package ARRAYS;

public class CheckIfArrayIsSortedOrNOt {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

       int answer = Integer.parseInt(isSorted(arr) ? "is sorted" : "not sorted");
        System.out.println(answer);


    }
    static boolean isSorted(int[] arr){

        for (int i = 1; i <arr.length ; i++) {
            if (arr[i] < arr[i - 1])
                return false;
        }
        return true;
    }
}
