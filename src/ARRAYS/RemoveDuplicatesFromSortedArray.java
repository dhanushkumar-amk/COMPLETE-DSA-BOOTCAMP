package ARRAYS;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] arr = {2,2,3,3,4,5,6,6};

        System.out.println("Before");
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        removeDuplicates(arr);

        

        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }

    }
    static void removeDuplicates(int[] arr){

        int j = 0;

        for (int i = 1; i <arr.length ; i++) {
            if (arr[j] != arr[i]){
                j++;
                arr[j] = arr[i];
            }
        }
    }
}
