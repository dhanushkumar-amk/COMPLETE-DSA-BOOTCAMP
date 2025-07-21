package STRIVER_SHEET.ARRAYS;

import java.util.ArrayList;
import java.util.Arrays;

public class UnionOfTwoSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1,1,2,3,4,5};
        int[] arr2 = {2,3,4,4,5,6};

        ArrayList<Integer> Union = FindUnion(arr1, arr2);
        System.out.println("Union of arr1 and arr2 is ");
        for (int val: Union)
            System.out.print(val+" ");
    }

    static ArrayList<Integer> FindUnion(int[] arr1, int[] arr2){
        int n1 = arr1.length;
        int n2 = arr2.length;

        int i = 0;
        int j = 0;

        ArrayList<Integer> Union = new ArrayList<>();

        while (i < n1 && j < n2){
           if(arr1[i] <= arr2[j]) {
               if (Union.size() == 0 || Union.get(Union.size() - 1) != arr1[i])
                   Union.add(arr1[i]);
               i++;
           }
           else{
               if (Union.size() == 0 || Union.get(Union.size() - 1) != arr2[j])
                   Union.add(arr2[j]);
               j++;
           }
        }

        while (i < n1){
            if(arr1[i] <= arr2[j]) {
                if (Union.size() == 0 || Union.get(Union.size() - 1) != arr1[i])
                    Union.add(arr1[i]);
                i++;
            }
        }

        while(j < n2){
            if (Union.size() == 0 || Union.get(Union.size() - 1) != arr2[j])
                Union.add(arr2[j]);
            j++;
        }
        return Union;
    }
}
