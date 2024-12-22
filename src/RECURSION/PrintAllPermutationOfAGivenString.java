package RECURSION;

public class PrintAllPermutationOfAGivenString {
    public static void main(String[] args) {
    char[] arr = {'a','b', 'c'};
    permutation(arr, 0);
    }

    static void permutation(char[] arr, int fixedIndex){

        if (fixedIndex == arr.length-1){
            System.out.println(arr);
            return;
        }

        for (int i = fixedIndex; i < arr.length ; i++) {
            swap(arr, i, fixedIndex);
            permutation(arr, fixedIndex + 1);
            swap(arr, i, fixedIndex);
        }

    }

    static void swap(char[] arr, int i, int fixedIndex){
        char temp = arr[i];
        arr[i] = arr[fixedIndex];
        arr[fixedIndex] = temp;
    }
}
