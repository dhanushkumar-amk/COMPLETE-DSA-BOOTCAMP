package STRIVER_SHEET.ARRAYS;

public class RearrangeArrayElementsBySign {
    public static void main(String[] args) {
    int[] arr = {3,1,-2,-5,2,-4};
    int[] ans = rearrangeArray(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    public static int[] rearrangeArray(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        int positiveIndex = 0;
        int negativeIndex = 1;

        for (int i = 0; i < n; ++i) {
            if(arr[i] < 0){
                ans[negativeIndex] = arr[i];
                negativeIndex += 2;
            }else{
                ans[positiveIndex] = arr[i];
                positiveIndex += 2;
            }
        }
        return ans;
    }
}