package STRIVER_SHEET.ARRAYS;

public class CountInversion {
    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 3, 5};
        System.out.println(inversionCount(arr));
    }


    public  static int inversionCount(int arr[]) {
        int count = 0;

        for (int i = 0; i < arr.length - 2; ++i) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] > arr[j])
                    count++;
            }
        }

        return count;
    }
}
