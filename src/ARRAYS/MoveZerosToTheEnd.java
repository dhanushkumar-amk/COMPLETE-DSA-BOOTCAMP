package ARRAYS;


public class MoveZerosToTheEnd {
    public static void main(String[] args) {
        int[] arr = {0,1,0,2,0,3,0,4};
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        toEnd(arr);

        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    static void toEnd(int[] arr){

        int size = arr.length;
        if (size == 0 || size == 1)
            return;

        int zero = 0;
        int nonZero = 0;

        while (nonZero < size){
            if (arr[nonZero] != 0){
                int temp = arr[nonZero];
                arr[nonZero] = arr[zero];
                arr[zero] = temp;
                nonZero++;
                zero++;
            }
            else
                nonZero++;
        }

    }
}
