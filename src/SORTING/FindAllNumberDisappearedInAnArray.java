package SORTING;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllNumberDisappearedInAnArray {
    public static void main(String[] args) {
    int[] arr = {4,3,2,7,8,2,3,1};
    ArrayList<Integer> ans  = findDisappearedNumbers(arr);
        System.out.println(ans);
    }
    static ArrayList<Integer> findDisappearedNumbers(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();

        int i = 0;
        while( i < arr.length){
            int correctIndex = arr.length - 1;
            if (arr[i] != correctIndex){
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            }else{
                i++;
            }
        }

        // just find the missing number and add as index + 1
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index)
                list.add(index + 1);
        }
        return list;
    }
}
