package STRIVER_SHEET.ARRAYS;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {2,8,23,14,46,5};
        System.out.println(linearSearch(arr, 14));
    }

    static int linearSearch(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target)
                return i;
        }
        return -1;
    }
}
