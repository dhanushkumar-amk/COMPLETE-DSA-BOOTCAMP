package ARRAYS;

public class MinimumNumberInArray {
    public static void main(String[] args) {
        int[] arr = {12,4,23,123,24,5,1};
        System.out.println(MinimumNumber(arr));
    }

    public static int MinimumNumber(int[] arr){
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min)
                min = arr[i];
        }

        return min;
    }
}
