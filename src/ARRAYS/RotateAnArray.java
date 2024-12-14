package ARRAYS;

public class RotateAnArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        System.out.println("Before");
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        /*

        // brute for method to  rotate k times

        int k = 3;
        for (int i = 0; i <k ; i++) {
            rotate1(arr);
            System.out.println("After ");
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j] + " ");

            }
        }
 */
        int k = -3;
        System.out.println();
        rotate2(arr, k);

        for (int i = 0; i < arr.length ; i++) {
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

    // rotate for k times with same rotate1 function
    static void rotate2(int[] arr, int k){
        k = k % arr.length;
        if (k < 0)
            k += arr.length;
        for (int i = 1; i <= k ; i++) {
            rotate1(arr);
        }
    }
}
