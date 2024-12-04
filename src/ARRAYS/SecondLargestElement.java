package ARRAYS;

public class SecondLargestElement {
    public static void main(String[] args) {
    int[] arr = {23,24,25,26,27,28};
        System.out.println(largest(arr));
    }

    static  int largest(int[] arr){
        int max1 = arr[0];
        int max2 = arr[0];

        for (int i = 1; i <arr.length ; i++) {
            if (arr[i] > max1){
                max2 = max1;
                max1 = arr[i];
            } else if (arr[i] > max2) {
                max2 = arr[i];
            }
        }
        return  max2;

    }
}
