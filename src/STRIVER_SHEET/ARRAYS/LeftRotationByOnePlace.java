package STRIVER_SHEET.ARRAYS;

public class LeftRotationByOnePlace {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        leftRotate(arr);
    }
    static void leftRotate(int[] arr){
        int temp = arr[0];

        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        arr[arr.length - 1] = temp;


        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
