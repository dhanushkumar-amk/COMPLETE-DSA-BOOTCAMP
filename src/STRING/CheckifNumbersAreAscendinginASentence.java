package STRING;

import java.util.Arrays;

public class CheckifNumbersAreAscendinginASentence {

    public static void main(String[] args) {
        CheckifNumbersAreAscendinginASentence ans = new CheckifNumbersAreAscendinginASentence();
        String s = "1 box has 3 blue 4 red 6 green and 12 yellow marbles";
        System.out.println(ans.areNumbersAscending(s));

    }

    public boolean areNumbersAscending(String s) {
        int previousValue = 0;
        String[] strs = s.split("");
        int[] arr = new int[strs.length];
        int index = 0;
        for (String str : strs) {
            try {
                arr[index++] = Integer.parseInt(str);
            } catch (NumberFormatException e) {
                System.out.println("error");
            }
        }

        int previous = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > previous) {
                previous = arr[i];
            } else
                return false;
        }
        return true;
    }
}
