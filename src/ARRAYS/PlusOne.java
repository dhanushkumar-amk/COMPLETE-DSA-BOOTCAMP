package ARRAYS;

import java.util.ArrayList;
import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] digits = {3,4,5};
        int[] ans = plusOne(digits);

        System.out.println(Arrays.toString(ans));
    }

    public static int[] plusOne(int[] digits) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < digits.length; i++) {
            sb.append(digits[i]);
        }

        String val = sb.toString();
        int valOne = Integer.parseInt(val);

        int ans = valOne + 1;

        ArrayList<Integer> list = new ArrayList<>();
        int index = digits.length;
        while (ans > 0){
            int lastVal = ans % 10;
            //arr[index] = lastVal;
            list.add(index, lastVal);
            ans /= 10;
            index--;
        }

        int[] result =new int[digits.length + 1];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;

    }

}
