package ARRAYS;

public class ReverseArrayAndRemoveDuplicates {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 3, 4, 5, 6, 6};

        // Step 1: Reverse the array
        reverse(arr);

        System.out.println("Reversed Array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        // Step 2: Remove duplicates from the reversed array
        int newSize = removeDuplicates(arr);

        System.out.println("Array after removing duplicates (reversed):");
        for (int i = 0; i < newSize; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static int removeDuplicates(int[] arr) {
        int j = 0; // Pointer for the position of unique elements

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[j]) { // Compare with the last unique element
                j++;
                arr[j] = arr[i];
            }
        }

        return j + 1; // New size of the array with unique elements
    }

    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
