package ARRAYS;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrangeArrayBySign {
    public static void main(String[] args) {
        int[] arr = {3,0,-2, -5, 2, -4};
        int[] answer = arrange(arr);
        System.out.println(Arrays.toString(answer));
    }

    static int[] arrange(int[] arr){

        ArrayList<Integer> positiveValue = new ArrayList<>();
        ArrayList<Integer> negativeValue = new ArrayList<>();

        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] > 0)
                positiveValue.add(arr[i]);
            else
                negativeValue.add(arr[i]);
        }

        int[] answer = new int[arr.length];
        int k = 0;
        int c = 0;

        while (c < positiveValue.size()){
            answer[k] = positiveValue.get(c);
            answer[k+1] = negativeValue.get(c);
            k+=2;
            c++;
        }
        return answer;
    }
}
