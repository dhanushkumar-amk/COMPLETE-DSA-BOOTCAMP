package ARRAYS;

public class SecondSmallestNumber {
    public static void main(String[] args) {
        int[] arr = {23,24,25,26,27,28};
        System.out.println(smallest(arr));
    }

    static  int smallest(int[] arr){
        int min1 = arr[0];
        int min2 = arr[0];

        for (int i = arr.length-1; i <= 0 ; i--) {
            if (arr[i] < min1){
                min2 = min1;
                min1 = arr[i];
            } else if (arr[i] < min2) {
                min2 = arr[i];
            }
        }
        return  min2;

    }
}
