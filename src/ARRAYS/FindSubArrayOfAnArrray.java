package ARRAYS;

public class FindSubArrayOfAnArrray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        subArray(arr);

    }

    static  void subArray(int[] arr){

        // base case
        if(arr.length == 1)
            return;

        for (int i = 0; i < arr.length ; i++) {
            for (int j = i; j < arr.length ; j++) {
                for (int k = i; k <=j ; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }
}
