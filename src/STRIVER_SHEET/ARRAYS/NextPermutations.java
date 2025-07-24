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

    if(index == -1)
        reverse();

    }
}
