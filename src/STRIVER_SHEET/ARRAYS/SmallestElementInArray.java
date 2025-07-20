package STRIVER_SHEET.ARRAYS;

public class SmallestElementInArray {
    public static void main(String[] args) {
        int[] arr = {2,5,1,3,9,7,10,2,5,6};
        System.out.println(smallest(arr));
    }

    private static int smallest(int[] arr) {
    int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; ++i) {
            if(arr[i] < min)
                min = arr[i];
        }
        return min;
    }
}
