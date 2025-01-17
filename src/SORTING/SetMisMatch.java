package SORTING;

public class SetMisMatch {

    public static void main(String[] args) {

    }

   static int[] findErrorNums(int[] arr) {

       int i = 0;
       while(i < arr.length){
           int correctIndex = arr[i] - 1;
           if (arr[i] != arr[correctIndex]){
               int temp =arr[i];
               arr[i] = arr[correctIndex];
               arr[correctIndex] = temp;
           }else {
               i++;
           }
       }

       for (int index = 0; index < arr.length; index++) {
           if (arr[index] != index + 1)
               return new int[]{arr[index], index + 1};
       }
        return new int[]{-1,-1};
    }
}
