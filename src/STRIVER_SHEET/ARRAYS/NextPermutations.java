package STRIVER_SHEET.ARRAYS;



public class NextPermutations {
    public static void main(String[] args) {

    }

    public static void nextPermutation(int[] arr) {
    int index = -1;
    int n = arr.length;
    for (int i = n - 2; i >= 0; i--) {
        if(arr[i] < arr[i + 1]){
            index = i;
            break;
        }
    }

    if(index == -1) {
        reverse(arr, 0, arr.length - 1);
        return;
    }

    for (int i = n - 1; i > index ; i--) {
            if(arr[i] > arr[index]){
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
                break;
            }
    }

        reverse(arr,0 + index + 1, arr.length - 1);
    }

    static void reverse(int[] arr, int i, int j){
        while (i <= j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

}
