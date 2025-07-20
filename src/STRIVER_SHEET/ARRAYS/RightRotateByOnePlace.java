package STRIVER_SHEET.ARRAYS;

public class RightRotateByOnePlace {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        rightRotate(arr);
    }


    static void rightRotate(int[] arr){
        int n = arr.length;
        int temp = arr[n - 1];

        for (int i = 1; i < n; i++) {
            arr[i + 1] = arr[i];
        }

        arr[0] = temp;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
