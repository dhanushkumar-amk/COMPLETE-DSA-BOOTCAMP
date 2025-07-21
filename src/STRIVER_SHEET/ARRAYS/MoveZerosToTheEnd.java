package STRIVER_SHEET.ARRAYS;

public class MoveZerosToTheEnd {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
        int n = 10;
        int[] ans = moveZeros(n, arr);
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println("");
    }

    static int[] moveZeros(int n, int[] arr){
        int[] ans = new int[n];
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                ans[index++] = arr[i];
            }
        }
        return ans;
    }
}
