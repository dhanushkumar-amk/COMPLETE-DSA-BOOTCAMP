package RECURSION;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {2,8,5,9,22,2,1};
        selectionSort(arr);
    }

    static void selectionSort(int[] arr,int row, int column, int max){

        if (row == 0)
            return;

        if (column < row){
            if (arr[column] > arr[max]){
                selectionSort(arr, row, column + 1, column);
            }
            else{
                selectionSort(arr, row, column +1, max);
            }
        }else{
            
        }

    }

}
