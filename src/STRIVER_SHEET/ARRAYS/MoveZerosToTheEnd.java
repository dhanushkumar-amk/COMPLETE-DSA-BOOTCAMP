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

        if(arr.length < 2)
            return new int[arr[0]];

        int[] ans = new int[arr.length];

        int i = 0;
        int j = ans.length - 1;

        for (int k = 0; k < arr.length; k++) {
            if(arr[k] != 0){
                ans[i] = arr[k];
                i++;
            } else {
                arr[j] = arr[k];
                j--;
            }
        }
        return ans;
    }
}
