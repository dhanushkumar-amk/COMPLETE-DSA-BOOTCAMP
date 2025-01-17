package SORTING;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicatesElementsInArray {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(duplicateNumber(arr));
    }

    static List<Integer> duplicateNumber(int[] arr){
        int i = 0;
            while(i < arr.length) {
                int correctIndex = arr[i] - 1;
                if (arr[i] != arr[correctIndex]) {
                    int temp = arr[i];
                    arr[i] = arr[correctIndex];
                    arr[correctIndex] = temp;
                } else {
                    i++;
                }
            }

        List<Integer> list = new ArrayList<>();
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1)
                list.add(index + 1);
        }
        return list;
    }
}
