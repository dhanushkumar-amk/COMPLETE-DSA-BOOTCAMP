package ARRAYS;

public class RotateAnArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        System.out.println("Before");
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        rotate1(arr);
        System.out.println("After ");
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        rotate1(arr);
        System.out.println("After ");
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    // brute force  for one place
    static  void rotate1(int[] arr){
        int temp = arr[0];

        for (int i = 1; i <arr.length ; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = temp;
    }
}
